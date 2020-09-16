package kz.springframework.sfgdi;

import kz.springframework.sfgdi.examplebeans.FakeDataSource;
import kz.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());
	}

}
