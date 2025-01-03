package org.richfaces.javascript.client.converter;

import org.junit.runners.Parameterized.Parameters;
import org.richfaces.javascript.client.RunParameters;

import jakarta.faces.convert.ByteConverter;
import jakarta.faces.convert.Converter;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ByteConverterTest extends ConverterTestBase {
    public ByteConverterTest(RunParameters criteria) {
        super(criteria);
    }

    @Parameters
    public static List<RunParameters[]> getRunParameterss() {
        return options(
                pass("true"),
                pass("ok"),
                pass("123"),
                pass("0"),
                pass("1"),
                pass("255"),
                pass("-128"),
                pass("-129"),
                pass("256"),
                pass("-0"),
                pass("0.05"));
    }

    @Override
    protected Converter createConverter() {
        ByteConverter byteConverter = new ByteConverter();
        return byteConverter;
    }

    @Override
    protected String getJavaScriptFunctionName() {
        return "convertByte";
    }

    @Override
    protected void compareResult(Object convertedValue, Object jsConvertedValue) {
        assertTrue(jsConvertedValue instanceof Double);
        assertTrue(convertedValue instanceof Byte);
        Double jsDouble = (Double) jsConvertedValue;
        Double jsfDouble = new Double((Byte) convertedValue);
        assertEquals(jsfDouble, jsDouble, 0.0000001);
    }
}
