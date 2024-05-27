package com.marketplace.vintage.item;
import com.marketplace.vintage.item.impl.SapatilhasItem;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import com.marketplace.vintage.item.impl.MalaItem;

import static org.junit.jupiter.api.Assertions.*;
import static com.marketplace.vintage.item.condition.ItemConditions.*;

public class ItemTest {
  Map<ItemProperty, Object> getProperties(){
    Map<ItemProperty, Object> itemProperties = new HashMap<>();
    itemProperties.put(ItemProperty.STOCK, 1);
    itemProperties.put(ItemProperty.ITEM_CONDITION, NEW);
    itemProperties.put(ItemProperty.DESCRIPTION, "A beautiful mala");
    itemProperties.put(ItemProperty.BRAND, "MyBrand");
    itemProperties.put(ItemProperty.BASE_PRICE, BigDecimal.valueOf(50.00));
    itemProperties.put(ItemProperty.PARCEL_CARRIER_NAME, "DHL");
    itemProperties.put(ItemProperty.DIMENSION_AREA, 100);
    itemProperties.put(ItemProperty.MATERIAL, "Wood");
    itemProperties.put(ItemProperty.COLLECTION_YEAR, 2022);
    itemProperties.put(ItemProperty.DEPRECIATION_RATE_OVER_YEARS, 5);

    return itemProperties;
  }

  Map<ItemProperty, Object> getProperties2(){
    Map<ItemProperty, Object> itemProperties = new HashMap<>();
    itemProperties.put(ItemProperty.STOCK, 2);
    itemProperties.put(ItemProperty.ITEM_CONDITION, NEW);
    itemProperties.put(ItemProperty.DESCRIPTION, "A mala");
    itemProperties.put(ItemProperty.BRAND, "Brand");
    itemProperties.put(ItemProperty.BASE_PRICE, BigDecimal.valueOf(57.00));
    itemProperties.put(ItemProperty.PARCEL_CARRIER_NAME, "LHD");
    itemProperties.put(ItemProperty.DIMENSION_AREA, 10);
    itemProperties.put(ItemProperty.MATERIAL, "od");
    itemProperties.put(ItemProperty.COLLECTION_YEAR, 2002);
    itemProperties.put(ItemProperty.DEPRECIATION_RATE_OVER_YEARS, 4);

    return itemProperties;
  }


  Map<ItemProperty, Object> getPropertiesSapatilhas(){
        Map<ItemProperty, Object> itemProperties = new HashMap<>();
        itemProperties.put(ItemProperty.STOCK, 1);
        itemProperties.put(ItemProperty.ITEM_CONDITION, NEW);
        itemProperties.put(ItemProperty.DESCRIPTION, "A beautiful sapatilha");
        itemProperties.put(ItemProperty.BRAND, "MyBrand");
        itemProperties.put(ItemProperty.BASE_PRICE, BigDecimal.valueOf(50.00));
        itemProperties.put(ItemProperty.PARCEL_CARRIER_NAME, "DHL");
        itemProperties.put(ItemProperty.SAPATILHA_SIZE, 100);
        itemProperties.put(ItemProperty.HAS_LACES, false);
        itemProperties.put(ItemProperty.COLOR, "blue");
        itemProperties.put(ItemProperty.COLLECTION_YEAR, 2022);

    return itemProperties;
  }

  MalaItem createMala(){
    ItemFactory itemFactory= new ItemFactory();

    UUID ownerUuid = UUID.randomUUID();
    String id = "TEST_ID";

    return (MalaItem) itemFactory.createItem(ownerUuid, id, ItemType.MALA, getProperties());
  }

  SapatilhasItem createSapatilhas(){
    ItemFactory itemFactory= new ItemFactory();

    UUID ownerUuid = UUID.randomUUID();
    String id = "TEST_ID";
    return (SapatilhasItem) itemFactory.createItem(ownerUuid, id, ItemType.SAPATILHAS, getPropertiesSapatilhas());
  }

  MalaItem createMala2(){
    ItemFactory itemFactory= new ItemFactory();

    UUID ownerUuid = UUID.randomUUID();
    String id = "TESTA";

    return (MalaItem) itemFactory.createItem(ownerUuid, id, ItemType.MALA, getProperties2());
  }


  @Test
  void setCurrentStockTest(){
    Item mala= createMala();
    assertThrowsExactly(IllegalArgumentException.class, () -> mala.setCurrentStock(-1));
    mala.setCurrentStock(0);
    assertEquals(0, mala.getCurrentStock());
    mala.setCurrentStock(1);
    assertEquals(1, mala.getCurrentStock());
  }

  @Test
  void getPropertyTest(){
    Item mala= createMala();
    Map<ItemProperty, Object> itemProperties= getProperties();
    for (Map.Entry<ItemProperty, Object> mapentry: itemProperties.entrySet()){
      assertEquals(mala.getProperty(mapentry.getKey(), Object.class), mapentry.getValue()); 
    }
    Exception e= assertThrowsExactly(IllegalArgumentException.class, () -> mala.getProperty(ItemProperty.TSHIRT_PATTERN, Object.class));// Verify invalid property handling
    String expectedMessage = "Property not available in item: " + ItemProperty.TSHIRT_PATTERN;
    String actualMessage = e.getMessage();
    assertEquals(actualMessage, expectedMessage);
  }


  @Test
  void equalsTest(){
    Item m= createMala();
    Item j= createMala2();
    assertTrue(m.equals(m));
    assertTrue(!m.equals(j));
  }

  @Test
  void hashTest(){
    SapatilhasItem s= createSapatilhas();
    assertEquals(s.hashCode(), s.hashCode());
  }
}
