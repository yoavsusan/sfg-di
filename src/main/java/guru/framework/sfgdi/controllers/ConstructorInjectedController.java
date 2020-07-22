package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
