package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;

    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }



}
