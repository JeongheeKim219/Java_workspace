

class EncapsulationExam {
	private int weight = 70;
	private int password = 316;
	
	//��й�ȣ�� �Է¹޾� ���� ��й�ȣ�� ��ġ�ϴ��� Ȯ���ϰ�
	//�����Ը� ����մϴ�.
	private void getWeight(int password) {
		if(isCorrectPassword(password) == true) {
			System.out.println(weight);
			System.out.println("���� �����Դ� " + weight + "�Դϴ�.");
		} else System.out.println("��й�ȣ ����ġ");
	}
	
	//��й�ȣ�� �Է¹޾� ���� ��й�ȣ�� ��ġ�ϴ��� Ȯ���ϰ�
	//���Ӱ� �Է¹��� �����Ը� ���� �����Կ� �����մϴ�.
	private void setWeight(int password, int newWeight) {
		if(isCorrectPassword(password) == true) {
			weight = newWeight;
			System.out.println("�����԰� " + weight + "���� ����Ǿ����ϴ�.");
		} else System.out.println("��й�ȣ ����ġ");
	}

	//���� ��й�ȣ�� �� ��й�ȣ�� �Է¹ް�
	//���� ��й�ȣ�� ��ġ�ϴٸ� �� ��й�ȣ�� �����մϴ�.
	private void getPassword(int oldPassword, int newPassword) {
		if(isCorrectPassword(oldPassword) == true) {
			this.password = newPassword;
			System.out.println("��й�ȣ�� " + password + "���� ����Ǿ����ϴ�.");
		} else System.out.println("��й�ȣ ����ġ");
	}
	
	//���� ��й�ȣ�� �´��� Ȯ���մϴ�.
	private boolean isCorrectPassword(int password) {
		if(this.password == password) return true;
		else return false;
	}

	public static void main(String[] args) {

		//EncapsulationExam�� ���� ��ü�� ������ ����, args�� Ÿ���� String���� int�� ��ȯ�մϴ�.
		EncapsulationExam encapsulation = new EncapsulationExam();
		int [] argsInt = new int [args.length];
		for(int i = 0; i < args.length; i++)
			argsInt[i] = Integer.parseInt(args[i]);
		
		//�μ��� ���� args�� �� ó�� ���ڷ� ����� �����մϴ�.
		if(argsInt[0] == 1)
			encapsulation.setWeight(argsInt[1], argsInt[2]);
		else if(argsInt[0] == 2)
			encapsulation.getWeight(argsInt[1]);
		else if(argsInt[0] == 3)
			encapsulation.getPassword(argsInt[1], argsInt[2]);
		else
			System.out.println("��ġ�ϴ� ����� �����ϴ�.");
	}
}