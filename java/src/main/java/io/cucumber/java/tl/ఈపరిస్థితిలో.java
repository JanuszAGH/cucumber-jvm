package io.cucumber.java.tl;

import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.StepDefinitionAnnotations;
import org.apiguardian.api.API;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To execute steps in a feature file the steps must be connected to executable
 * code. This can be done by annotating a method with a cucumber or regular
 * expression.
 * <p>
 * The parameters extracted from the step by the expression along with the data
 * table or doc string argument are provided as arguments to the method.
 * <p>
 * The types of the parameters are determined by the cucumber or regular
 * expression.
 * <p>
 * The type of the data table or doc string argument is determined by the
 * argument name value. When none is provided cucumber will attempt to transform
 * the data table or doc string to the type of the last argument.
 *
 * @deprecated moved to {@code io.cucumber.java.te}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@StepDefinitionAnnotation
@Documented
@Repeatable(ఈపరిస్థితిలో.ఈపరిస్థితిలోs.class)
@API(status = API.Status.STABLE)
@Deprecated
public @interface ఈపరిస్థితిలో {
    /**
     * A cucumber or regular expression.
     *
     * @return a cucumber or regular expression
     */
    String value();

    /**
     * Allows the use of multiple 'ఈపరిస్థితిలో's on a single method.
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @StepDefinitionAnnotations
    @Documented
    @interface ఈపరిస్థితిలోs {
        ఈపరిస్థితిలో[] value();
    }
}
