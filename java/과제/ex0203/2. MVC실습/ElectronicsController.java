

/**
	View�� Model ���̿��� �߰��� ����
	����� ��û(view)�� �޾� �� ��û�� �ش��ϴ� Model(Service)�� ȣ���ϰ�,
	ȣ��� ����� �ٽ� �޾Ƽ� �� ����� ���� View�� ȣ���Ѵ�.
*/
public class ElectronicsController {
	private ElectronicsService service;

	public ElectronicsController() {
		service = ElectronicsService.getInstance();
	}

	public void insert(Electronics electronics) {
		int num = service.insert(electronics);
		if(num == 1) {
			EndView.printMessage("�����߽��ϴ�.");
		} else if(num == 2){
			EndView.printMessage("��� ����Ʈ�� ���� á���ϴ�.");
		} else {
			EndView.printMessage("�ߺ��� �� ��ȣ�Դϴ�.");
		}
	}

	public void selectAll() {
		EndView.printAll(service.selectAll());
	}

	public void searchByModelNo(int modelNo) {
		Electronics electronics = service.searchByModelNo(modelNo);
		if(electronics != null) {
			EndView.printSearchByNodelNo(electronics);
		} else {
			EndView.printMessage("�ش��ϴ� ������ �����ϴ�.");
		}
	}

	public void update(Electronics electronics) {
		if(service.update(electronics)) {
			EndView.printMessage("������Ʈ�� �����߽��ϴ�..");
		} else {
			EndView.printMessage("������Ʈ�� �����߽��ϴ�.");
		}
	}

	public void delete(int modelNo) {
		if(service.delete(modelNo)) {
			EndView.printMessage("�����߽��ϴ�.");
		} else {
			EndView.printMessage("�ش��ϴ� ������ �����ϴ�.");
		}
	}

	public void purchase(int money) {
		Electronics [] electronics = service.purchase(money);
		if(electronics.length != 0) {
			EndView.printPurchaseList(electronics);
		} else {
			EndView.printMessage("�ƹ� �͵� �� �� �����ϴ�.");
		}
	}
}