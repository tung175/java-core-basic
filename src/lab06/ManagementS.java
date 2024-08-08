package lab06;

import java.util.ArrayList;

public class ManagementS {
	public static void main(String[] args) {
		Student st1 = new Student(0, "Tung");
		Student st2 = new Student(1, "Nguyen");
		Student st3 = new Student(2, "Han");
		Student st4 = new Student(3, "Van");
		Student st5 = new Student(4, "Hien");

		ArrayList<Student> listSt = new ArrayList<Student>();

		listSt.add(st1);
		listSt.add(st2);
		listSt.add(st3);
		listSt.add(st4);
		listSt.add(st5);

		System.out.println("My array: " + listSt);

		for (int i = 0; i < listSt.size(); i++) {
			if (listSt.get(i).getName().startsWith("Nguyen")) {
				System.out.println("starts with Nguyen: " + listSt.get(i));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
