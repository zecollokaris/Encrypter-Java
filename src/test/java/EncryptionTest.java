import org.junit.*;
import static org.junit.Assert.*;

public class EncryptionTest {
    Encoder en=new Encoder();

    @Test
    public  void doTest_On_StringValue(){
        assertEquals(true,en.isString());
    }

    @Test
    public  void doTest_On_Encode(){
        assertEquals("abc",en.encoderData("bcd",1));
    }
}