package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	
	public InlineExamConsole() {
		exam = null;
	}
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total : %d, avg : %f\n", exam.total(), exam.avg());
	}

}
