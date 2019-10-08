import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("red tortilla");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue tortilla");
        kitchenWithMany.add("red tortilla");
        kitchenWithMany.add("yellow tortilla");
    }

    @Test
    public void testIfTortillaExists(){
        assertEquals(0, emptyKitchen.size());
        assertTrue(emptyKitchen.isEmpty());

        assertEquals(1, kitchenWithOne.size());
        assertFalse(kitchenWithOne.isEmpty());

        assertEquals(3, kitchenWithMany.size());
        assertFalse(kitchenWithMany.isEmpty());
    }

//    Integration tests 1/2
    @Test
    public void testIfATortillaCanBeAdded(){
        assertFalse(emptyKitchen.contains("red tortilla"));
        assertTrue(kitchenWithOne.contains("red tortilla"));
        assertTrue(kitchenWithMany.contains("red tortilla"));
    }


    @Test
    public void testIfTortillaCanBePopped(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());
    }


}
