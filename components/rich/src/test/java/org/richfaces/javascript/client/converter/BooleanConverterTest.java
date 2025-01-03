package org.richfaces.javascript.client.converter;

import org.junit.runners.Parameterized.Parameters;
import org.richfaces.javascript.client.RunParameters;

import jakarta.faces.convert.BooleanConverter;
import jakarta.faces.convert.Converter;
import java.util.List;

public class BooleanConverterTest extends ConverterTestBase {
    public BooleanConverterTest(RunParameters criteria) {
        super(criteria);
    }

    @Parameters
    public static List<RunParameters[]> getRunParameterss() {
        return options(pass("true"), pass("ok"), pass("123"), pass("0"), pass("1"), pass("no"));
    }

    @Override
    protected Converter createConverter() {
        return new BooleanConverter();
    }

    @Override
    protected String getJavaScriptFunctionName() {
        return "convertBoolean";
    }
}
