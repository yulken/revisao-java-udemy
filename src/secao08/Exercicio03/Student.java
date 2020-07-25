package secao08.Exercicio03;

public class Student {
	public String name;
	public double s1, s2, s3;

	public double getFinalGrade() {
		return this.s1 + this.s2 + this.s3;
	}

	public void printStatus() {
		if (this.getFinalGrade() < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - this.getFinalGrade()) + " POINTS");
		} else {
			System.out.println("PASS");
		}

	}
}
