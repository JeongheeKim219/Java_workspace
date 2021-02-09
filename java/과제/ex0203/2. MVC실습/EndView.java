

/**
	����� ��û�� ���� ����� ȭ�鿡 ����ϴ� Ŭ����
*/
public class EndView {

	/**
		��ü ���
	*/
	public static void printAll(Electronics[] electronics) {
		for(int i = 0; i < ElectronicsService.count; i++) {
			System.out.println(electronics[i].getModelNo() + "\t" + electronics[i].getModelName() + "\t" + electronics[i].getModelPrice() + "\t" + electronics[i].getModelDetail());
		}
		System.out.println();
	}

	public static void printPurchaseList(Electronics[] electronics) {
		for(int i = 0; i < electronics.length; i++) {
			System.out.println(electronics[i].getModelNo() + "\t" + electronics[i].getModelName() + "\t" + electronics[i].getModelPrice() + "\t" + electronics[i].getModelDetail());
		}
		System.out.println();
	}

	/**
		�� ��ȣ�� �ش��ϴ� ������ǰ ���
	*/
	public static void printSearchByNodelNo(Electronics electronics) {
		System.out.println(electronics.getModelNo() + "\t" + electronics.getModelName() + "\t" + electronics.getModelPrice() + "\t" + electronics.getModelDetail());
		System.out.println();
	}
	
	/**
		���� �Ǵ� ���п� ���� �޽��� ���
	*/
	public static void printMessage(String str) {
		System.out.println(str);
		System.out.println();
	}
}