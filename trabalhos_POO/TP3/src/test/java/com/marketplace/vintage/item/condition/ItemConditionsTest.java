package com.marketplace.vintage.carrier;
import com.marketplace.vintage.item.condition.ItemConditions;

import static com.marketplace.vintage.item.condition.ItemConditions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ItemConditionsTest{ 
  
  public void createUsedTest(){
    assertThrowsExactly(IllegalArgumentException.class, () -> ItemConditions.createUsed(0, 5));
    assertThrowsExactly(IllegalArgumentException.class, () -> ItemConditions.createUsed(11, 5));
    assertThrowsExactly(IllegalArgumentException.class, () -> ItemConditions.createUsed(4, -1));
    assertDoesNotThrow(()-> ItemConditions.createUsed(1, 10));
    assertDoesNotThrow(()-> ItemConditions.createUsed(10, 1));
    assertDoesNotThrow(()-> ItemConditions.createUsed(5, 5));
  }
}


