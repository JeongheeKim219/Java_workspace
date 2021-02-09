import java.util.Scanner;

class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է�| 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("---------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();
				
			if(selectNo == 1) {
				studentNum = Exercise09.setStudentNum();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				if(Exercise09.check(scores))
					Exercise09.setScore(scores);
			} else if(selectNo == 3) {
				if(Exercise09.check(scores))
					Exercise09.getScore(scores);
			} else if(selectNo == 4) {
				if(Exercise09.check(scores))
					Exercise09.analysist(scores);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	static public int setStudentNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�л���> ");
		int studentNum = scanner.nextInt();
		return studentNum;
	}

	static public void setScore(int[] arr) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("score[" + i + "]> ");
			arr[i] = scanner.nextInt();
		}
	}

	static public void getScore(int[] arr) {
		for(int i : arr)
			System.out.println("score[" + i + "]> " + i);
	}

	static public void analysist(int[] arr) {
		int max = arr[0];
		int sum = 0;
		int count = 0;
		double avg = 0.0;

		for(int i : arr) {
			if(max < i)
				max = i;
			count++;
			sum += i;
		}
		avg = (int)(sum / (double)count * 10) / 10.0;
		System.out.println("�ְ� ���� : " + max);
		System.out.println("��� ���� : " + avg);
	}

	static public boolean check(int[] arr) {
		if(arr != null)
			return true;
		else {
			System.out.println("�л� ���� �ʿ��մϴ�.");
			return false;
		}
	}
}