/**
 *
 */
package org.richfaces.javascript.client.validator;

import org.junit.runners.Parameterized.Parameters;
import org.richfaces.javascript.client.RunParameters;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @author asmirnov
 */
public class MaxValidatorTest extends BeanValidatorTestBase {
    private static final String MAXIMUM = "value";

    /**
     * @param criteria
     */
    public MaxValidatorTest(RunParameters criteria) {
        super(criteria);
    }

    @Parameters
    public static List<RunParameters[]> parameters() {
        return options(pass(0, PROP, "number", MAXIMUM, 2), pass(2, PROP, "number", MAXIMUM, 2),
                pass(123, PROP, "number", MAXIMUM, 2));
    }

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.javascript.client.MockTestBase#getJavaScriptFunctionName()
     */
    @Override
    protected String getJavaScriptFunctionName() {
        return "validateMax";
    }

    @Override
    protected Class<?> getBeanType() {
        return Bean.class;
    }

    public static final class Bean {
        @Max(2)
        public int getNumber() {
            return 0;
        }
    }
}
