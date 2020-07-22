package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
