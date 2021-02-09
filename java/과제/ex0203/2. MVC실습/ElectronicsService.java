

/**
	������ǰ�� �����ϴ� ��ü
	���, ����, ��ü�˻�, �κа˻� ����� ����ϴ� Ŭ����
*/

public class ElectronicsService {
	private static ElectronicsService instance;
	Electronics elecArr[];
	public static int count;
	String [][] data = new String [][] {
			{"10", "��ǳ��", "20000" ,"��ǳ�� �ʹ� �ÿ��ؿ�"},
			{"20", "������", "300000" ,"�Ｚ ��ǳ ������"},
			{"30", "�Ѱ���", "119900" ,"�� �԰�ʹ�."},
			{"40", "��ä��", "23000" ,"�׳� ��ä�ϴ� ������"},
			{"50", "��â��", "12000" ,"�ƹ����� �����ϴ� ����"},
		};

	private ElectronicsService() {
		elecArr = new Electronics[100];
		count = data.length;
		for(int i = 0; i < data.length; i++) {
			elecArr[i] = new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]);
		}
	}

	public static ElectronicsService getInstance() {
		instance = new ElectronicsService();
		return instance;
	}

	/**
		0, �ߺ�
		1, ��� ����
		2, �迭�� ���̸� ���
	*/
	public int insert(Electronics electronics) {

		for(int i = 0; i < count; i++)
			if(elecArr[i].getModelNo() == electronics.getModelNo())
				return 0;

		if(count < 100) {
			elecArr[count++] = electronics;
			return 1; 
		} else {
			return 2;
		}
		
	}

	public Electronics[] selectAll() {
		return elecArr;
	}

	public Electronics searchByModelNo(int modelNo) {
		for(int i = 0; i < count; i++)
			if(elecArr[i].getModelNo() == modelNo)
				return elecArr[i];
		return null;
	}

	public boolean update(Electronics electronics) {
		Electronics newElectronics = searchByModelNo(electronics.getModelNo());
		if(newElectronics != null) {
			newElectronics.setModelDetail(electronics.getModelDetail());
			return true;
		} else {
			return false;
		}	
	}

	public boolean delete(int modelNo) {
		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelNo() == modelNo) {
				elecArr[i] = elecArr[count-1];
				count--;
				return true;
			}
		}
		return false;
	}

	public Electronics[] purchase(int money) {
		
		int arrCount = 0;
		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelPrice() <= money) {
				arrCount++;
			}
		}

		Electronics[] electronicsArray = new Electronics [arrCount];

		arrCount = 0;

		for(int i = 0; i < count; i++) {
			if(elecArr[i].getModelPrice() <= money) {
				electronicsArray[arrCount++] = elecArr[i];
			}
		}

		return electronicsArray;
	}
}