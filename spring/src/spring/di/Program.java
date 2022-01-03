package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.HoseokExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 Exam exam = new HoseokExam(); // InlineExamConsole, GridExamConsole들이 exam을
		 조립함 --> DI //ExamConsole console = new InlineExamConsole(exam); ExamConsole
		 console = new GridExamConsole(); 
		 console.setExam(exam);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		// 이름을 가지고 IoC Container에서 꺼내쓰기(Casting 작업이 필요하다)
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		// 자료형명으로 IoC 컨테이너에서 꺼내쓰기
		// ExamConsole이라는 녀석의 class타입에 맞는 녀석을 달라는 말
		// 즉 ExamConsole에 참조될 수 있는 객체를 찾아달라는 말
		// (여기서는 인터페이스 형식이므로 인터페이스 형식에 참조될 수 있는것을 찾음)
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		// XML을 이용해 값을 초기화 하는 방법
		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new HoseokExam(1,1,1,1));
		
		for (Exam e : exams) {
			System.out.println(e);
		}
		// new ArrayList<>()
	}
}
