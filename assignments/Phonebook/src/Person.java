/**************************************************************************************************************
 * Program: To create a phone directory. 
 * Description: Program is to create a phone directory which includes person's credentials:-
 * 				1) First Name
 *				2) Last Name
 * 				3) Phone No.
 * 				Then perfom operations :-
 * 				1) Enter the details.
 * 				2) Remove the specific detail.
 * 				3) Search a specific detail by First Name.
 * 				4) Sort by First Name.
 *************************************************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Details {

	private String fname, lname;
	private int number;
	private static int id = 1;

	public Details(String fname, String lname, int number) {
		this.fname = fname;
		this.lname = lname;
		this.number = number;

	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getNumber() {
		return number;
	}

	public int getId() {
		return id++;
	}

}


class Sortbyname implements Comparator<Pbook>
{
    // setting record in  Ascending order 
    public int compare(Details a, Details b)
    {
        return a.firstname.compareTo(b.firstname);
    }
}





public class Person {
	
	public static void main(String args[]) {
		int choice;
		List<Details> list = new ArrayList<>();
		while (true) {
			System.out.println("Enter the choice to do");

			System.out.println("1:Add NEw data of Person \n " + "2.Remove data from collection \n "
					+ "3.Search person by name  \n " + "4.Display All records  \\n " +   
					"5.Search person by name ");

			Scanner input1 = new Scanner(System.in);
			choice = input1.nextInt();

			switch (choice) {

			// Enter the details from user.
			case 1: {
				System.out.println("ENter the details");

				Scanner input2 = new Scanner(System.in);
				String first = input2.next();
				String last = input2.next();
				int num = input2.nextInt();

				// break;

				Details d1 = new Details(first, last, num);

				list.add(d1);
				System.out.println("Record added successfully");
				break;

			}

			// Remove a specific detail by taking input as an ID
			case 2: {
				System.out.println("Remove the details of a person");
				Scanner sc1 = new Scanner(System.in);
				int RemoveById = sc1.nextInt();
				list.remove(RemoveById);
				System.out.println("Record deleted successfully");
				break;

			}

			// Search phone number by first name.
			case 3: {
				System.out.println("Search the details of a person by name");
				Scanner sc1 = new Scanner(System.in);
				String SearchByName = sc1.next();
				Iterator<Details> itr = list.iterator();
				String isFound = null;
				while (itr.hasNext()) {
					Details d1 = itr.next();
					isFound = d1.getFname();
					if (isFound.equalsIgnoreCase(SearchByName)) {
						// System.out.println("Record found/n");
						System.out
								.println(d1.getFname() + " " + d1.getLname() + " " + d1.getNumber() + " " + d1.getId());
					} else
						System.out.println("Record not found");
				}
				break;
			}

			case 4: {
				System.out.println("Display all the details");
				Iterator<Details> itr = list.iterator();
				while (itr.hasNext()) {
					Details d1 = itr.next();
					System.out.println(d1.getFname() + " " + d1.getLname() + " " + d1.getNumber() + " " + d1.getId());
				}

			}
				
				case 5:
			System.out.println("Sorted list is =>> ");
		if(list.size()>0)
		{
		Collections.sort(list, new Sortbyname());
 
     
        		for (int i1=0; i1<list.size(); i1++)
            		System.out.println(list.get(i1));
 
 
			}	
		else
		{
  			 System.out.println("Empty List");

		}
		break;
           	 default :
            	System.out.println("Invalid Input");

 

		}
				
			}
		}
	}

