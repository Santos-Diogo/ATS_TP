package com.marketplace.vintage.order;

import com.marketplace.vintage.order.invoice.InvoiceLine;
import com.marketplace.vintage.order.invoice.ParcelShipmentCostInvoiceLine;
import com.marketplace.vintage.order.invoice.ItemSatisfactionInvoiceLine;
import com.marketplace.vintage.utils.VintageDate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testGetParcelCarrierShippingCost() {
        ParcelShipmentCostInvoiceLine line1 = Mockito.mock(ParcelShipmentCostInvoiceLine.class);
        ParcelShipmentCostInvoiceLine line2 = Mockito.mock(ParcelShipmentCostInvoiceLine.class);
        ParcelShipmentCostInvoiceLine line3 = Mockito.mock(ParcelShipmentCostInvoiceLine.class);

        Mockito.when(line1.getParcelCarrierName()).thenReturn("CarrierA");
        Mockito.when(line1.getPrice()).thenReturn(new BigDecimal("10.00"));

        Mockito.when(line2.getParcelCarrierName()).thenReturn("CarrierA");
        Mockito.when(line2.getPrice()).thenReturn(new BigDecimal("15.00"));

        Mockito.when(line3.getParcelCarrierName()).thenReturn("CarrierB");
        Mockito.when(line3.getPrice()).thenReturn(new BigDecimal("20.00"));

        List<InvoiceLine> invoiceLines = Arrays.asList(line1, line2, line3);
        Order order = new Order("orderId", UUID.randomUUID(), List.of(), invoiceLines, BigDecimal.ZERO, null);

        BigDecimal result = order.getParcelCarrierShippingCost("CarrierA");
        BigDecimal result2= order.getParcelCarrierShippingCost("CarrierC");

        assertEquals(new BigDecimal("25.00"), result);
        assertEquals(new BigDecimal("0"), result2);    
    }

    @Test
    public void testGetSumOfSatisfactionPrices() {
        ItemSatisfactionInvoiceLine line1 = Mockito.mock(ItemSatisfactionInvoiceLine.class);
        ItemSatisfactionInvoiceLine line2 = Mockito.mock(ItemSatisfactionInvoiceLine.class);
        ItemSatisfactionInvoiceLine line3 = Mockito.mock(ItemSatisfactionInvoiceLine.class);

        Mockito.when(line1.getPrice()).thenReturn(new BigDecimal("10.00"));
        Mockito.when(line2.getPrice()).thenReturn(new BigDecimal("20.00"));
        Mockito.when(line3.getPrice()).thenReturn(new BigDecimal("30.00"));

        List<InvoiceLine> invoiceLines = Arrays.asList(line1, line2, line3);
        Order order = new Order("orderId", UUID.randomUUID(), List.of(), invoiceLines, BigDecimal.ZERO, null);

        BigDecimal result = order.getSumOfSatisfactionPrices();

        assertEquals(new BigDecimal("60.00"), result);
    }

    @Test
    public void testGetSumOfItemPricesFromSeller() {
        String orderId = "order123";
        UUID sellerID = UUID.randomUUID();
        List<OrderedItem> orderedItems = new ArrayList<>();
        orderedItems.add(new OrderedItem(sellerID, "Item1", "Seller1", new BigDecimal("10.00"))); // Example item from seller 1
        orderedItems.add(new OrderedItem(sellerID, "Item2", "Seller2", new BigDecimal("20.00"))); // Example item from seller 2
        orderedItems.add(new OrderedItem(UUID.randomUUID(), "Item3", "Seller1", new BigDecimal("30.00"))); // Example item from seller 1
        
        List<InvoiceLine> invoiceLines = new ArrayList<>();
        BigDecimal totalPrice = new BigDecimal("60.00");

        Order order = new Order(orderId, UUID.randomUUID(), orderedItems, invoiceLines, totalPrice, null);

        BigDecimal result = order.getSumOfItemPricesFromSeller(sellerID);
        assertEquals(new BigDecimal("30.00"), result);
    }
}
