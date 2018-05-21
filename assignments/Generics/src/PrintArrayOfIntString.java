import java.util.Scanner;

/*
* 
* Program name        : Print Array Of Integer & String
* Program Description : Let's say you have an integer array and a string array.
* 						You have to write a single method
* 						printarray that can print all the elements of both arrays.
* 						The method should be able to 
* 						accept both integer and string arrays.
*   Date : 16-May-2018
*/



/*
 * @author Rashmi Jaiswal
 * Generic method printarray is printing integer 
 * array list and string array list together.
 */

public class PrintArrayOfIntString {
  // generic method
  public static <E> void printArray(E[] inputArray) {
    // display array elements
    for (E element : inputArray)
      System.out.printf("%s ", element);

    System.out.println();
  }

  public static void main(String args[]) {
    // create arrays of Integer, String
  
	  System.out.println("enter string");

		String[] array1 = new String[3];
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc1.nextLine();

		}
  
		 System.out.println("enter integers");

			Integer[] array2 = new Integer[3];
			Scanner sc2 = new Scanner(System.in);
			for (int i = 0; i < array2.length; i++) {
				array2[i] = sc2.nextInt();

			}
  

    System.out.println("Array stringArray contains:");
    printArray(array1); // pass an string array
   
    System.out.println("\nArray integerArray contains:");
    printArray(array2); // pass a integer array
  } // end main
}