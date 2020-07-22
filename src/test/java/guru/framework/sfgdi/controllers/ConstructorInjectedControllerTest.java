package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.PropertyGreetingService;
import guru.framework.sfgdi.services.IGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        IGreetingService greetingService = new PropertyGreetingService();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}