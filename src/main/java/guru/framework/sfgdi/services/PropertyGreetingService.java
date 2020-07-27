package guru.framework.sfgdi.services;

public class PropertyGreetingService implements IGreetingService {

    @Override
    public String getGreeting() {
        return "Hello World - Property";
    }
}
