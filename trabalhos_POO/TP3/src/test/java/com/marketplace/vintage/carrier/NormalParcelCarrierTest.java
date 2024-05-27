package com.marketplace.vintage.carrier;
import org.junit.jupiter.api.Test;
import com.marketplace.vintage.item.ItemType;

import static org.junit.jupiter.api.Assertions.*;
public class NormalParcelCarrierTest{
  @Test
  void canDeliverItemType(){
    ItemType itemType= ItemType.MALA;
    ItemType itemType2= ItemType.MALA_PREMIUM;

    NormalParcelCarrier n= new NormalParcelCarrier("DHL", "EXP");
    NormalParcelCarrier n1= new NormalParcelCarrier("DHL", "EXP");
    NormalParcelCarrier n2= new NormalParcelCarrier("LHD", "EXP");


    //Test Premium vs. Normal
    assertEquals(n.canDeliverItemType(itemType), !itemType.isPremium());
    assertTrue(!n.canDeliverItemType(itemType2));

    //TestEquals
    assertTrue(n.equals(n));
    assertTrue(!n.equals(null));
    assertTrue(n.equals(n1));
    assertTrue(!n.equals(n2));
  }
}
