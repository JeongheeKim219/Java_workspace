class ReportCard {
	public static void main(String [] args) {

		String name = "�赿��";
		//1. koreanScore, 2. englishScore, 3. mathScore
		int [] scoreArray = new int [3];

		if(args.length == 3)
			for(int i = 0; i < 3; i++)
				scoreArray[i] = Integer.parseInt(args[i]);
		else
			for(int i = 0; i < 3; i++)
				scoreArray[i] = (int)(Math.random() * 56) + 45;

		Calculator calculator = new Calculator();
		calculator.yourInformation(name, scoreArray);
	}
}

class Calculator {

	//������ ���ϴ� ���
	private int getTotal(int [] scoreArray) {
		int total = 0;
		for(int i = 0; i < scoreArray.length; i++)
			total += scoreArray[i];
		return total;
	}

	//����� ���ϴ� ���
	private double getAverage(int total, int numberOfSubjects) {
		double average = total / (double)numberOfSubjects;
		average = (int)(average * 10) / 10.0;
		return average;
	}

	//����� ã�� ���
	private char getGrade(double average) {
		char grade = '\u0000';
		if(average >= 90) grade = 'A';
		else if(average >= 80 && average < 90) grade = 'B';
		else if(average >= 70 && average < 80) grade = 'C';
		else if(average >= 60 && average < 70) grade = 'D';
		else grade = 'F';
		return grade;
	}
	
	//������ ����ϴ� ���
	public void yourInformation(String name, int [] scoreArray) {
		int total = this.getTotal(scoreArray);
		double average = this.getAverage(total, scoreArray.length);
		char grade = this.getGrade(average);

		System.out.println();
		System.out.println(name + "���� ������");
		System.out.println("�������� : " + scoreArray[0]);
		System.out.println("�������� : " + scoreArray[1]);
		System.out.println("�������� : " + scoreArray[2]);
		System.out.println("���� : " + total + ", ��� : " + average + ", ���� : " + grade + " �Դϴ�.");
	}
}