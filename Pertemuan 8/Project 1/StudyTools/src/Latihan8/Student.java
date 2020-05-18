package Latihan8;
import java.util.*;

public class Student {
	public Student(int x, String n, String s, double g) {
		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}
	public int getStudentId()
	{
		 return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name = name;
	}
	public String getSSN()
	{
		return ssn;
	}
	public void setSSN()
	{
		this.ssn = ssn;
	}
	public double getGPA()
	{
		return gpa;
	}
	public void setGPA()
	{
		this.gpa = gpa;
	}
	public String toString()
	{
		String s1 = "";
		s1 = "Student Id: " + getStudentId() +
				"Student Name: " + getName() +
				"Student SSN: " + getSSN() +
				"Student GPA: " + getGPA();
		return s1;
	}
}

public class StudentTester
{
	public static void main(String [] args) {
		Student s1 = new Student(123, "Mary Smith", "999-99-9999", 4.0);
		System.out.println(s1);
		Student s2 = new Student();
		s2.setStudentId(124);
		s2.setName("John Coboy");
		s2.setSSN("123-45-6789");
		s2.setGPA(4.0);
		System.out.println(s2);
		Student s3 =  new Student();
		System.out.println(s3);
	}
}


