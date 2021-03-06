package guru.framework.sfgdi.services;

public class PrimaryGreetingService implements  IGreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return "Hello World - EN Primary";
    }
}
