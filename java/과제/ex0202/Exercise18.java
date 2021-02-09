class ShopService {
	//�ٸ� ��ü�� �����Ϸ��� ���� 3��° ���� �ּ�ó��
	private static ShopService instance = new ShopService();
	private ShopService() {}

	public static ShopService getInstance() {
		//�ٸ� ��ü�� �����Ϸ��� ���� �ּ��� ����
		//ShopService instance = new ShopService();
		return instance;
	}
}

class Exercise18 {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2)
			System.out.println("���� ShopService ��ü �Դϴ�.");
		else
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
	}
}