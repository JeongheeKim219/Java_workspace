

class Lotto{

	public static void main(String[] args) {

		//���� �ʱ�ȭ
		int lottoNum [] = new int [6];
		Lotto lotto = new Lotto();
		
		//�ζ� ��ȣ ���� �� ���
		lotto.createNumber(lottoNum);
		lotto.print(lottoNum);
		
		System.out.println();

		//�������� ���� �� ���
		for(int i = 1; i < 6; i++)
			lotto.descendingOrder(lottoNum, i);
		lotto.print(lottoNum);

	}

	//���� 6���� ���� �������� ���� �����ϰ�
	//check�޼ҵ带 ���������� �����ϸ鼭 �ߺ��� ���Ѵ�.
	public void createNumber(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			i = check(arr, i);
		}
	}

	//�����ڼ� �޼ҵ�
	public void descendingOrder(int [] arr, int i) {
		if(arr[i] <= arr[i-1]) return;
		int temp = arr[i-1];
		arr[i-1] = arr[i];
		arr[i] = temp;
		
		if(i >= 2) descendingOrder(arr, i-1);
	}
	
	//���� ��ȣ�� üũ�ϴµ�, ���� ������ ���Դ� �����
	//return�� �ϸ鼭 for�� �� �� �� ���� �ֵ��� count ���� ���δ�.
	public int check(int [] arr, int count) {
		for(int i = 0; i < count; i++) {
			if(arr[i] == arr[count])
				return count - 1;
		}
		return count;
	}

	//�迭�� ���� ����ϴ� ���
	public void print(int [] arr) {
			for(int i = 0; i < arr.length; i++) {
				if(i == 0)
					System.out.print("[ ");
				System.out.print(arr[i] + " ");
				if (i == arr.length - 1)
					System.out.print("]");
		}
	}
}