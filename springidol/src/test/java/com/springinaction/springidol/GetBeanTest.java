package com.springinaction.springidol;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@DisplayName("Wiring beans test")
public class GetBeanTest {
    private static ApplicationContext ctxt;

    @Test
    public void testGetBean() throws PerformanceException {
        System.out.println("testGetBean()");
        Performer performer = (Performer)ctxt.getBean("duke");
        assertNotNull("Couldn't retrieve duke bean", performer);

        // now go and execute this thing - will print out some stuff...
        performer.perform();
    }

    @Test
    public void testGetBeanWithDI() throws PerformanceException {
        System.out.println("testGetBeanWithDI()");
        Performer performer = (Performer)ctxt.getBean("poeticDuke");
        assertNotNull("Couldn't retrieve poeticDuke bean", performer);

        // now go and execute this thing - will print out some stuff...
        performer.perform();
    }

    @Test
    public void testGetBeanByFactoryMethod() {
        System.out.println("testGetBeanByFactoryMethod()");
        Stage stage = (Stage)ctxt.getBean("theStage");

        assertNotNull("Couldn't retrieve theStage bean", stage);
    }

    @Test
    public void testGetBeanWithPropertiesAndDI() throws PerformanceException {
        System.out.println("testGetBeanWithPropertiesAndDI()");
        Performer performer = (Performer)ctxt.getBean("kenny");
        assertNotNull("Couldn't retrieve kenny bean", performer);

        // now go and execute this thing - will print out some stuff...
        performer.perform();
    }

    @Test
    public void testGetBeanWithCollection() throws PerformanceException {
        System.out.println("testGetBeanWithCollection()");
        Performer performer = (Performer)ctxt.getBean("hank");
        assertNotNull("Couldn't retrieve hank bean", performer);

        // now go and execute this thing - will print out some stuff...
        performer.perform();
    }

    @BeforeAll
    static void beforeAll() {
        //System.out.println("Before all test methods");

        ctxt = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
    }

    @BeforeEach
    void beforeEach() {
        //System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        //System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        //System.out.println("After all test methods");
    }
}
