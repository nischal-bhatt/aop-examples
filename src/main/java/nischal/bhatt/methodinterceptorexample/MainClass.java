package nischal.bhatt.methodinterceptorexample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nischal.bhatt.methodinterceptorexample.RunningExample.RunningExample;

public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		
		RunningExample rs = (RunningExample) context.getBean("proxy");
		rs.writeSomething(3,"hi");
		rs.hello(new String("hi"));
	}

}
