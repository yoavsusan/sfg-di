package guru.framework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements IGreetingService {

    @Override
    public String getGreeting() {
        return "Hello World - Setter";
    }
}
