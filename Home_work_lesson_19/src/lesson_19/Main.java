package lesson_19;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("Serialization.txt");
		Employee employee = new Employee("Petro", 12, 3400);
		Methods.serialize(file, employee);
		System.out.println(Methods.deserialize(file));

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Igor", 19, 4300));
		Methods.serialize(file, (Serializable) emp);
		System.out.println(Methods.deserialize(file));
	}
}
