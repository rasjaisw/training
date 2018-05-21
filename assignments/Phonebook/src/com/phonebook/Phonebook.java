package com.phonebook;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Phonebook   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****PERSON DETAILS******");
		System.out.println("1. Add data");
		System.out.println("2. Remove Data");
		System.out.println("3 . Search by name");
		System.out.println("4 . Search by phonenumber");
		System.out.println("5 . Search by id");
		System.out.println("6 . Sorted list on id");
		System.out.println("7 . Sorted list on name");
		System.out.println("8 . exit");
		List<Person> per=new ArrayList<Person>();
		IPhonrBook phonebook=new PhoneBookImpl();
		Person person=new Person();
		Person person1=new Person(5, "Rashmi", "Jaiswal", 954541456);
		Person person2=new Person(8, "eashmi", "Jaiswal", 954541456);
		Person person3=new Person(2, "kashmi", "Jaiswal", 954541456);
		Person person4=new Person(9, "washmi", "Jaiswal", 954541456);
		
		per.add(person1);
		per.add(person2);
		per.add(person3);
		per.add(person4);
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Enter your First Name");
			String firstName=scan.next();
			person.setFirstName(firstName);
			System.out.println("Enter your Last Name" );
			String lastName=scan.next();
			person.setLastName(lastName);
			System.out.println("Enter your Id");
			int id=scan.nextInt();
			person.setId(id);
			System.out.println("Enter your phone number");
			long phone=scan.nextLong();
			person.setPhoneNumber(phone);
		           per= phonebook.addPerson(person);
		          System.out.println(per);
			    break;
		case 2:
			
			   System.out.println("Enter your first name");
			   String fname=scan.next();
			   if(fname.equals(person.getFirstName()))
			   {
				   System.out.println(person.getFirstName());
				   phonebook.deletePerson(person);
			   }
			    
			    break;
		case 3 :
	            System.out.println("Enter your first name");
	            String name=scan.next();
	            if(name.equals(person.getFirstName()))
	            {
	            	for(Person persons:per)
	            	{
	            		if(persons.getFirstName().contains(name))
	            		{
	            		System.out.println("The details are"+per);
	            		}
	            		else
	            		{
	            			System.out.println("No details");
	            		}
	            	}
	            }
	            
     			
			  break;
			  
		case 4 :
			System.out.println("Enter your phone number");
		     Long phoneno=scan.nextLong();
			     phonebook.search(phoneno,person);
			 
			     
			    break;
			    
		case 5 : 
			System.out.println("Enter your id");
		     Integer personId=scan.nextInt();
			     phonebook.search(personId,person);

			    break;
		case 6:
			System.out.println("sorted list is:");
			 Collections.sort(per, Person.perid);
			   for(Person strid: per){
					System.out.println(strid);
			   }
			  break;
		case 7 :
		
			System.out.println("sorted list on name");
			
			   Collections.sort(per, Person.personname);

			  // for(Person strname: per){
				//	System.out.println(strname);
			   per.stream().forEach((i->{System.out.println(i);}));
			   
			   //}
			   break;
			
		case 9: 
			//System.out.println("BYE");
			System.exit(0);
			
			break;
			
		
		}

	}

}
}