package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

// GridExamConsole = Exam출력시 격자 형태로 출력
public class GridExamConsole implements ExamConsole {
	
	// 기본생성자를 호출하며 injection이 된다.
	@Autowired(required = false)
	@Qualifier("exam1")
	private Exam exam;

	public GridExamConsole() {
		System.out.println("constructor");
	}
	
	// 오버로드 생성자에서 Qualifier는 매개변수에 직접 설정해야함
	//@Autowired
	public GridExamConsole(/*@Qualifier("exam1")*/Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null) {
			System.out.println("total :\t" + 0);
			System.out.println("avg :\t" + 0);
		}
		else {
			System.out.println("total :\t" + exam.total());
			System.out.println("avg :\t" + exam.avg());
		}
	}


	// setter를 호출하며 injection 가능
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}
