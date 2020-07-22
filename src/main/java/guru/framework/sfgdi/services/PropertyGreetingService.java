package guru.framework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements IGreetingService {

    @Override
    public String getGreeting() {
        return "Hello World - Property";
    }
}
