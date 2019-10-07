import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfHashExists(){
        assertNotNull(CodeupCrypt.getHash());
        assertEquals( "F3r", CodeupCrypt.getHash());
        assertEquals( "n4nd0", CodeupCrypt.getHash());
    }

}
