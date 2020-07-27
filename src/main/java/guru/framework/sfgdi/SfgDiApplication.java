package guru.framework.sfgdi;

import guru.framework.sfgdi.controllers.ConstructorInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext appCtx = SpringApplication.run(SfgDiApplication.class, args);

//		I18nController i18nController = (I18nController) appCtx.getBean("i18nController");
//		System.out.println(i18nController.getGreeting());
//
//		MyController myController = (MyController) appCtx.getBean("myController");
//		System.out.println("-------");
//		System.out.println(myController.getGreeting());
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appCtx.getBean("propertyInjectedController");
//		System.out.println("-------");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		SetterInjectedController setterInjectedController = (SetterInjectedController) appCtx.getBean("setterInjectedController");
//		System.out.println("-------");
//		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCtx.getBean("constructorInjectedController");
		System.out.println("-------");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
