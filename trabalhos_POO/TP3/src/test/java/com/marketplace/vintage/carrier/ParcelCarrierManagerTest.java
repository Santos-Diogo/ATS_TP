package com.marketplace.vintage.carrier;

import com.marketplace.vintage.exceptions.EntityAlreadyExistsException;
import com.marketplace.vintage.exceptions.EntityNotFoundException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class ParcelCarrierManagerTest {

    @Test
    void testParcelCarrierManager() {
        ParcelCarrierManager parcelCarrierManager = new ParcelCarrierManager();

        String testNormal= "DHL";
        String testPremium= "DHL-Deluxe";

        parcelCarrierManager.registerParcelCarrier(ParcelCarrierFactory.createNormalParcelCarrier(testNormal));
        parcelCarrierManager.registerParcelCarrier(ParcelCarrierFactory.createPremiumParcelCarrier(testPremium));

        ParcelCarrier parcelCarrier = parcelCarrierManager.getCarrierByName(testNormal);
        ParcelCarrier parcel_carrier_delux= parcelCarrierManager.getCarrierByName(testPremium);
        assertEquals("DHL", parcelCarrier.getName());
        assertEquals("DHL-Deluxe", parcel_carrier_delux.getName());

        assertThrowsExactly(EntityNotFoundException.class, () -> parcelCarrierManager.getCarrierByName("UPS"));
        assertThrowsExactly(EntityAlreadyExistsException.class, () -> parcelCarrierManager.registerParcelCarrier(ParcelCarrierFactory.createNormalParcelCarrier(testNormal)));
    }
}
