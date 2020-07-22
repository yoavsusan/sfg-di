package guru.framework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnglishGreetingService implements IGreetingService{

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
