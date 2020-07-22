package com.globallogic.app;

public class StudentDetail {
	
	//Sin parámetros
public void studenAge() {
	int age = 0;
	age= age +5;
	System.out.println("La edad del estudiante es: " + age);
}
//con parámetros
public void studenAge(int age) {
	
	System.out.println("La edad del estudiante es: " + age);
}

public static void main(String[] args) {
	StudentDetail student = new StudentDetail();
	student.studenAge();
	student.studenAge(23);
}
}
