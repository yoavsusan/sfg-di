package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }

}
