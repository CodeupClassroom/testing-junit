import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfHashExists(){
        assertNotNull(CodeupCrypt.getHash(""));
    }

    @Test
    public void testIfHashWorks(){
        assertEquals( "", CodeupCrypt.getHash(""));
        assertEquals( "F3r", CodeupCrypt.getHash("Fer"));
        assertEquals( "n4nd0", CodeupCrypt.getHash("nando"));
        assertEquals("43109", CodeupCrypt.getHash("aeiou"));
    }

    @Test
    public void testIfCheckPasswordWorks(){
        assertTrue(CodeupCrypt.checkPassword("F3r"));
        assertFalse(CodeupCrypt.checkPassword("n4ndo"));
    }

}
