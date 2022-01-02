package spring.di.ui;

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

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
