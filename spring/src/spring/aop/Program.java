package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.HoseokExam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new HoseokExam(1,1,1,1);
		
		Exam proxy = (Exam) Proxy.newProxyInstance(HoseokExam.class.getClassLoader(), new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// Cross-cutting Concern
						long start = System.currentTimeMillis();

						// Core Concern 실제 업무 로직 호출
						Object result = method.invoke(exam, args);
						// Cross-cutting Concern
						long end = System.currentTimeMillis();
						
						String message = (end - start) + "ms 시간이 걸렸습니다.";
						System.out.println(message);
						
						return result;
					}
				});
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %f\n", proxy.avg());
		
	}

}
