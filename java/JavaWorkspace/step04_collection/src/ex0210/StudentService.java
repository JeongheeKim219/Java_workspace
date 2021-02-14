package ex0210;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list = new ArrayList<Student>();
	
	public StudentService() {
		list.add(new Student(100, "�赿��", 24, "��⵵"));
		list.add(new Student(200, "�谡��", 28, "������"));
		list.add(new Student(300, "�����", 54, "������"));
		list.add(new Student(400, "������", 59, "�������"));
		list.add(new Student(500, "ȫ�浿", 82, "1249����"));
	}
	/**
	 * ����ϱ�
	 * return : true�̸� ��� ����, false�̸� ��� ����
	 */
	public boolean insert(Student student) {
		if(searchBySno(student.getSno()) != null) return false;
		list.add(student);
		return true;
	}
	
	/**
	 * ��ü �˻�
	 */
	public List<Student> selectAll() {
		return list;
	}
	
	/**
	 * �й��� �ش��ϴ� ���� �˻�
	 */
	public Student searchBySno(int sno) {
		for(int i = 0; i < list.size(); i++)
			if(sno == list.get(i).getSno())
				return list.get(i);
		return null;
	}
	
	/**
	 * �й��� �ش��ϴ� �л� �����ϱ�
	 * @return : true�̸� ���� ����, false�̸� ���� ����
	 */
	public boolean delete(int sno) {
		Student student = searchBySno(sno);
		if(student == null) return false;
		list.remove(student);
		return true;
	}
	
	/**
	 * �й��� �ش��ϴ� �л��� ���� �����ϱ� (�̸�, �ּ�)
	 * @return : true�̸� ���� ����, false�̸� ���� ����
	 */
	public boolean update(Student st) {
		Student student = searchBySno(st.getSno());
		if(student == null) return false;
		student.setName(st.getName());
		student.setAddr(st.getAddr());
		return true;
	}
}
