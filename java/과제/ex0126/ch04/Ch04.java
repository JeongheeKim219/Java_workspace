/*
1. ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־� ������.

�� : 

���ǹ� - if, switch

�ݺ��� - for, while, do while

2. ���ǹ��� �ݺ����� ������ �� �� Ʋ�� ���� �����Դϱ�?

�� : 2�� / double�� switch������ ����� �� �����ϴ�.

3. for���� �̿��Ͽ� 1���� 100������ ���� �߿��� 3�� ��� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.

�� :
		int sum = 0;
		for(int i = 1; i < 100; i++)
			if(i % 3 == 0)
			sum += i;
		System.out.print(sum);

4. while���� Math.random() �޼ҵ带 �̿��ؼ� ... �ֻ��� ... �ڵ带 �ۼ��غ�����

�� :
		int num1 = 0;
		int num2 = 0;

		for( ; ; ) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if(num1 + num2 == 5)
				break;
		}

5. ��ø for ���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y)���·� ����غ�����.

�� :	for(int i = 1; i <= 10; i++)
			for(int j = 1; j <= 10; j++)
				if((4 * i) + (5 * j) == 60)
					System.out.println("(" + i + ", " + j + ")");


*/

class Ch04
{
	public static void main(String [] args) {
		
	
	}
}