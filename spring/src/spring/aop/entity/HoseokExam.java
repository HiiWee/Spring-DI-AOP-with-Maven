package spring.aop.entity;

// HoseokExam = Exam data 구현 객체
public class HoseokExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;

	public HoseokExam() {
	}

	public HoseokExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	@Override
	public int total() {
		// Cross-cutting Concern
		//long start = System.currentTimeMillis();
		/*---------------------------------*/
		
		// Core Concern
		int result = kor + eng + math + com;
		
		
		
		/*---------------------------------*/
		// Cross-cutting Concern
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//long end = System.currentTimeMillis();
		
		//String message = (end - start) + "ms 시간이 걸렸습니다.";
		//System.out.println(message);
		
		return result;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f;
		
		return result;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "HoseokExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
