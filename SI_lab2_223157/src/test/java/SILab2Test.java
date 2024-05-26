import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void everyBranchTest() {
        // RuntimeException("allItems list can't be null!");
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        // RuntimeException("Invalid character in item barcode!");
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("name", "8z", 100, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        // RuntimeException("No barcode!");
        items.clear();
        items.add(new Item("name", null, 100, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 100));
        assertTrue(ex.getMessage().contains("No barcode!"));

        // return false;
        items.clear();
        items.add(new Item(null, "023", 400, 0.8f));
        assertFalse(SILab2.checkCart(items, 100));

        // return true;
        items.clear();
        items.add(new Item("name", "023", 90, 0));
        assertTrue(SILab2.checkCart(items, 100));
    }

    @Test
    void multipleConditionTest() {
        // item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
        // T T T
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("name", "023", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 500));
        // T T F
        items.clear();
        items.add(new Item("name", "123", 400, 0.1f));
        assertTrue(SILab2.checkCart(items, 800));
        // T F X
        items.clear();
        items.add(new Item("name", "023", 400, 0));
        assertTrue(SILab2.checkCart(items, 800));
        // F X X
        items.clear();
        items.add(new Item("name", "023", 200, 0.1f));
        assertTrue(SILab2.checkCart(items, 800));
    }
}
