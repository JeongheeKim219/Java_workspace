

class AscendingOrder {

	public static void main(String [] args) {
		
		//�ʱ�ȭ
		int arr[] = new int []{5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
		
		//�������� ����
		for(int i = 1; i < 10; i++)
			move(arr, i);

		//���
		for(int i = 0; i < 10; i++)
			System.out.print(arr[i] + " ");	

	}
	
	//�����ϴ� �޼ҵ�(����, ����, ����)
	//���������Դϴ�.
	public static void move(int [] arr, int i) {
		if(arr[i] >= arr[i-1]) return;
		int temp = arr[i-1];
		arr[i-1] = arr[i];
		arr[i] = temp;
		
		if(i >= 2) move(arr, i-1);
	}
}