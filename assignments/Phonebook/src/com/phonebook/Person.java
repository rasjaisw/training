package com.phonebook;
import java.util.Comparator;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String firstName, String lastName, long phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	 public static Comparator<Person> personname= new Comparator<Person>() {

			public int compare(Person s1, Person s2) {
			   String PerName1 = s1.getFirstName().toUpperCase();
			   String PerName2 = s2.getFirstName().toUpperCase();

			  
			   return PerName1.compareTo(PerName2);
			}
		    };
	
	
	public static Comparator<Person> perid= new Comparator<Person>() {

		public int compare(Person p1, Person p2) {

		   int person1 = p1.getId();
		   int person2 = p2.getId();

		   /*For ascending order*/
		   return person1-person2;
		}
	
	};
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}