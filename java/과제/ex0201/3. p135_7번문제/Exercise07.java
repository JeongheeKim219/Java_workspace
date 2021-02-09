import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		boolean run = true;
		int choice = 0;

		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			choice = scanner.nextInt();
			switch(choice) {
				case 1:
					bank.deposit();
					break;
				case 2:
					bank.withdraw();
					break;
				case 3:
					System.out.println(bank.getBalance());
					break;
				case 4:
					System.exit(0);
			}
		}
		System.out.println("���α׷� ����");
	}
}

class Bank {
	private int balance = 0;
	Scanner scanner = new Scanner(System.in);

	public void deposit() {
		System.out.print("���ݾ�> ");
		balance += scanner.nextInt();
	}

	public void withdraw() {
		System.out.print("��ݾ�> ");
		int tempBalance = scanner.nextInt();
		if(balance < tempBalance)
			System.out.println("��ݾ��� �� Ů�ϴ�.");
		else
			balance -= tempBalance;
	}

	public int getBalance() {
		return balance;
	}
}