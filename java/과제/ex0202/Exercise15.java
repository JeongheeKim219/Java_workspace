class MemberService {

	String id;
	String password;

	MemberService() {
		id = "hong";
		password = "12345";
	}

	public boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password))
			return true;
		else
			return false;
	}

	public void logout(String id) {
		if (this.id.equals(id))
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		else
			return;
	}
}

class Exercise15 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}