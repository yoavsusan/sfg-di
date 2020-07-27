package guru.framework.sfgdi.services;

public class PrimarySpanishGreetingService implements IGreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return "Hello world - ES";
    }
}
