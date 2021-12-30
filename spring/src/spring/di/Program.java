package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.HoseokExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// Exam = Interface
		// HoseokExam = Exam data 구현 객체
		Exam exam = new HoseokExam();
		
		// ExamConsole = Interface type
		// InlineExamConsole = Exam출력시 한줄에 출력
		//ExamConsole console = new InlineExamConsole(exam);
		
		// InlineExamConsole = Exam출력시 격자 형태로 출력
		ExamConsole console = new GridExamConsole(exam);	
		// InlineExamConsole, GridExamConsole들이 exam을 조립함 --> DI
		console.print();
	}

	
}
