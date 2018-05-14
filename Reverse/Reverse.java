/**
* The program displays reverse string
* @author  Rashmi Jaiswal
* @date 14/5/18 
**/

//	Java program to Reverse a String using swapping
	// of variables
	import java.lang.*;
	import java.io.*;
	import java.util.*;
	 
	
	public class Reverse {

	    public static void main(String[] args)
	    {
	        String input = "Let's take LeetCode contest";
	        char[] temparray = input.toCharArray();
	        int left, right=0;
	        right = temparray.length-1;
	 
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right]=temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
	    }
	}


