

import com.alipay.codequery.coref.sql.util.JavaObject2CorefDataConverter;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class JavaObject2CorefDataConverterTest {

    class TestObject {
        boolean getPrimitiveBoolean() {
            return true;
        }

        Boolean getBoolean() {
            return true;
        }

        Boolean getFalseBoolean() {
            return false;
        }

        Integer getInteger() {
            return 1;
        }

        int getPrimitiveInteger() {
            return 2;
        }

        Byte getByte() {
            return 127;
        }

        Number getNumber() {
            return 3.14159;
        }

        Long getLong() {
            return 314159L;
        }

        String getString() {
            return "foo";
        }

        List<String> getListOfString() {
            return Arrays.asList("foo", "bar");
        }

        String[] getArrayOfString() {
            return new String[]{"foo", "bar"};
        }

        Boolean getNPE() {
            throw new NullPointerException();
        }

        File getFile() {
            return new File("");
        }
    }

    @Test
    public void testConvert() {
        TestObject x = new TestObject();

        Assert.assertEquals((Integer) 1, JavaObject2CorefDataConverter.convert(x, TestObject::getPrimitiveBoolean, Integer.class, ""));
        Assert.assertEquals((Integer) 1, JavaObject2CorefDataConverter.convert(x, TestObject::getBoolean, Integer.class, ""));
        Assert.assertEquals((Integer) 0, JavaObject2CorefDataConverter.convert(x, TestObject::getFalseBoolean, Integer.class, ""));
        Assert.assertEquals((Integer) 1, JavaObject2CorefDataConverter.convert(x, TestObject::getInteger, Integer.class, ""));
        Assert.assertEquals((Integer) 2, JavaObject2CorefDataConverter.convert(x, TestObject::getPrimitiveInteger, Integer.class, ""));
        Assert.assertEquals((Integer) 127, JavaObject2CorefDataConverter.convert(x, TestObject::getByte, Integer.class, ""));
        Assert.assertEquals("3.14159", JavaObject2CorefDataConverter.convert(x, TestObject::getNumber, String.class, ""));
        Assert.assertEquals("314159", JavaObject2CorefDataConverter.convert(x, TestObject::getLong, String.class, ""));
        Assert.assertEquals("foo", JavaObject2CorefDataConverter.convert(x, TestObject::getString, String.class, ""));
        Assert.assertEquals("[foo, bar]", JavaObject2CorefDataConverter.convert(x, TestObject::getListOfString, String.class, ""));
        Assert.assertEquals("[foo, bar]", JavaObject2CorefDataConverter.convert(x, TestObject::getArrayOfString, String.class, ""));
    }

    @Test
    public void testConvertAMethodThrowingNPECanReturnDefaultValue() {
        TestObject x = new TestObject();

        Assert.assertEquals("", JavaObject2CorefDataConverter.convert(x, TestObject::getNPE, String.class, ""));
        Assert.assertEquals((Integer) 0, JavaObject2CorefDataConverter.convert(x, TestObject::getNPE, Integer.class, ""));
    }

    @Test
    public void testCanThrowClassCastException() {
        TestObject x = new TestObject();
        // Convert to List is not supported
        Assert.assertThrows(ClassCastException.class, () -> JavaObject2CorefDataConverter.convert(x, TestObject::getInteger, List.class, ""));
    }

    @Test
    public void testConvertIncompatibleObject() {
        TestObject x = new TestObject();

        Assert.assertEquals("", JavaObject2CorefDataConverter.convert(x, TestObject::getFile, String.class, ""));
    }
}