package me.liuhu.study.effective.java.annotation;

// Program to process marker annotations (Page 182)

import org.atteo.classindex.ClassIndex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Iterable<Class<?>> annotations =  ClassIndex.getAnnotated(Test.class);
        for(Class<?> klass : annotations) {
            System.out.printf(klass.getName());
        }

        Iterable<Class<?>> testClasss =  ClassIndex.getAnnotated(TestClass.class);
        for(Class<?> klass : testClasss) {
            System.out.printf(klass.getName());
        }



        Class<?> testClass = Class.forName("me.liuhu.study.effective.java.annotation.Sample");
        Object o = testClass.getDeclaredConstructor().newInstance();
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(o,null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
