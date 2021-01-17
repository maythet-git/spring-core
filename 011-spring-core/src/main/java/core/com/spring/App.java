package core.com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import core.com.spring.config.SpringConfig;
import core.com.spring.controller.CompanyController;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		CompanyController controller = context.getBean(CompanyController.class);
		
		controller.getComapny();
		
		context.close();
	}
}
