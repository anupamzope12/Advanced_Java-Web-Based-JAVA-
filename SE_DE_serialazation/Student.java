package SE_DE_serialazation;

import java.io.Serializable;

public class Student implements Serializable {

	private String first_Name;
	private  String last_Name;
	private static int rollNo;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String first_Name, String last_Name, int rollNo, String city) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.rollNo = rollNo;
		this.city = city;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [first_Name=" + first_Name + ", last_Name=" + last_Name + ", rollNo=" + rollNo + ", city="
				+ city + "]";
	}
	
	
}
