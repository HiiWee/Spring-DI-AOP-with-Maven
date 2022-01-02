package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.HoseokExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/*
		 Exam exam = new HoseokExam(); // InlineExamConsole, GridExamConsole들이 exam을
		 조립함 --> DI //ExamConsole console = new InlineExamConsole(exam); 
		 ExamConsole console = new GridExamConsole();
		 
		 console.setExam(exam);
		 */
		console.print();
		
	}
}
