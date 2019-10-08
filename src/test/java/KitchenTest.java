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
//        kitchenWithOne.add("red tortilla");
    }

    @Test
    public void testIfTortillaExists(){
        assertEquals(0, kitchenWithOne.size());
        assertTrue(kitchenWithOne.isEmpty());

        kitchenWithOne.add("blue tortilla");

        assertEquals(1, kitchenWithOne.size());
        assertFalse(kitchenWithOne.isEmpty());
    }

//    Integration tests 1/2
    @Test
    public void testIfATortillaCanBeAdded(){
        assertFalse(kitchenWithOne.contains("red tortilla"));
        kitchenWithOne.add("red tortilla");
        assertTrue(kitchenWithOne.contains("red tortilla"));
    }


}
