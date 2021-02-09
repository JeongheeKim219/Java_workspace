import java.util.Scanner;

class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}

public class Exercise20 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if(selectNo == 1)
				createAccount();

			else if(selectNo == 2)
				accountList();

			else if(selectNo == 3)
				deposit();

			else if(selectNo == 4)
				withdraw();

			else if(selectNo == 5)
				run = false;
			
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {

		printTitle("���»���");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		System.out.print("������ : ");
		String owner = scanner.next();

		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance);

		if(account != null) {
			accountArray[count++] = account;
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("����ġ ���� ������ �߻��߽��ϴ�.");

		clearScreen();
	}

	private static void accountList() {

		printTitle("���¸��");
		if(count == 0)
			System.out.println("���� ����� �������� �ʽ��ϴ�.");
		for(int i = 0; i < count; i++)
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		
		clearScreen();
	}

	private static void deposit() {
		
		printTitle("����");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		Account account = findAccount(ano);

		if(account != null) {
			System.out.print("���ݾ� : ");
			int balance = scanner.nextInt();
			account.setBalance(account.getBalance() + balance);
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		} else
			System.out.println("��ġ�ϴ� ���¸� ã�� �� �����ϴ�.");

		clearScreen();
		
	}

	private static void withdraw() {
		printTitle("���");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();

		Account account = findAccount(ano);

		if(account != null) {
			System.out.print("��ݾ� : ");
			int balance = scanner.nextInt();
			if(account.getBalance() >= balance) {
				account.setBalance(account.getBalance() - balance);
				System.out.println("��� : ����� �����Ǿ����ϴ�.");
			} else
				System.out.println("��� : ��ݿ� �����߽��ϴ�.");

		} else
			System.out.println("��ġ�ϴ� ���¸� ã�� �� �����ϴ�.");

		clearScreen();
		
	}

	private static Account findAccount(String ano) {
		for(int i = 0; i < count; i++)
			if(ano.equals(accountArray[i].getAno()))
				return accountArray[i];
		return null;
	}
	
	private static void printTitle(String title) {
		System.out.println("-----------");
		System.out.println(title);
		System.out.println("-----------");
	}

	private static void clearScreen() {
		for(int i = 0; i < 5; i++)
			System.out.println();
	}
}