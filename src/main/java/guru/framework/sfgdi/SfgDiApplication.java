package guru.framework.sfgdi;

import guru.framework.sfgdi.examplebeans.FakeDataSource;
import guru.framework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext appCtx = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource fakeDataSource = appCtx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUsername());

		FakeJmsBroker fakeJmsBroker = appCtx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());
	}

}
