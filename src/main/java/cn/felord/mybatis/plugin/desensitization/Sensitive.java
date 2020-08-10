package cn.felord.mybatis.plugin.desensitization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Sensitive.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Sensitive {
   /**
    * Strategy sensitive strategy.
    *
    * @return the sensitive strategy
    */
   SensitiveStrategy strategy();
}
