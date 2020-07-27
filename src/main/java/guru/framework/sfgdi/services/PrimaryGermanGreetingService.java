package guru.framework.sfgdi.services;

public class PrimaryGermanGreetingService implements IGreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return "Hello world - DE";
    }
}
