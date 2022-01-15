package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// Cross-cutting Concern
		long start = System.currentTimeMillis();

		// Core Concern 실제 업무 로직 호출
		Object result = invocation.proceed();
		
		// Cross-cutting Concern
		long end = System.currentTimeMillis();

		String message = (end - start) + "ms 시간이 걸렸습니다.";
		System.out.println(message);

		return result;
	}
}
