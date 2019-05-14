package me.liuhu.study.effective.java.annotation;

import org.atteo.classindex.IndexAnnotated;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Marker annotation type declaration - Page 180


// Marker annotation type declaration (Page 180)

/**
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 */
@IndexAnnotated
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}