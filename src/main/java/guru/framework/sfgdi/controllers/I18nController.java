package guru.framework.sfgdi.controllers;

import guru.framework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final IGreetingService greetingService;

    public I18nController(@Qualifier("i18nGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
