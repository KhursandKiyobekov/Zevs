import org.junit.Assert;
import org.junit.Test;

public class Day7Test {

    @Test
    public void verifylogicofmethodsDay7 () {
        Assert.assertEquals (true, "test".startsWith("te"));
        Assert.assertEquals (false, "test".startsWith("tr"));
        Assert.assertEquals (true, "test".endsWith("st"));
        Assert.assertEquals (false, "test".endsWith("se"));
        Assert.assertEquals ("10", String.valueOf(10));
        Assert.assertEquals ( "bc", "abcdf".substring(1,3));
        Assert.assertEquals (true, "test".contains("s"));
        Assert.assertEquals (true,"".isEmpty());
        Assert.assertEquals (4, "test".length());
        Assert.assertEquals ("test", "test".toLowerCase());
        Assert.assertEquals ("test", "test".toUpperCase());
        Assert.assertArrayEquals("come back after 18", new int[18], new int[18]);




    }

}
