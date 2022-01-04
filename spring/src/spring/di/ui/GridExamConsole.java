package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

// GridExamConsole = Exam출력시 격자 형태로 출력
public class GridExamConsole implements ExamConsole {
	private Exam exam;

	public GridExamConsole() {
		
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("total :\t" + exam.total());
		System.out.println("avg :\t" + exam.avg());
	}

	@Autowired
	@Qualifier("exam1")
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
