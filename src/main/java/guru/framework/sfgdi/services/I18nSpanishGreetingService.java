package guru.framework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nSpanishGreetingService implements IGreetingService{

    @Override
    public String getGreeting() {
        return "Hola Mundo - ES";
    }
}
