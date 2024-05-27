import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import org.junit.jupiter.api.Test;
import com.marketplace.vintage.item.ItemController;
import static org.junit.jupiter.api.Assertions.*;

public class ItemControllerTest{
  @Test
  void addItemStockTest(){
    ItemController c= new ItemController(new ItemManager(), new ItemFactory());
    assertThrowsExactly(IllegalArgumentException.class,() -> c.addItemStock(null, -1));
  }

  @Test
  void removeItemStockTest(){
    ItemController c= new ItemController(new ItemManager(), new ItemFactory());
    assertThrowsExactly(IllegalArgumentException.class,() -> c.removeItemStock(null, -1));
  }
}
