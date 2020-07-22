package guru.framework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class PrimaryGreetingService implements  IGreetingService {

    @Override
    public String getGreeting() {
        return "Hello World - Primary";
    }
}
