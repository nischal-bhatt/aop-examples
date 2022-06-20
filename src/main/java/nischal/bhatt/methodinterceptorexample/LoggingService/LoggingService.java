package nischal.bhatt.methodinterceptorexample.LoggingService;

import java.lang.reflect.Parameter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("------------------------------");
		System.out.println("printing before invoked method");
		Parameter[] params=invocation.getMethod().getParameters();
		
		for(int i =0; i<params.length; i++)
		{
			System.out.println(params[i].getName());
		}
		
		Object ret = invocation.proceed();
		System.out.println("printing after invoked method");
		System.out.println("------------------------------");
		return ret;
	}

}
