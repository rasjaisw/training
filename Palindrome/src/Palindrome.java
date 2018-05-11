/**
* The program simply displays weather the no. is palindrome or not
* @author  Rashmi Jaiswal
* @date 11/5/18 
**/
import java.util.Scanner;
public class Palindrome {
	
		 public static void main(String args[]){  
		  int r,sum=0,temp;  
		 Scanner sc=new Scanner(System.in);
		 
		 
		 System.out.println("Enter a number to check if it is a palindrome");  
	      int num = sc.nextInt();   //getting number from user
	      
	   
		  temp=num;  
		  
		  while(num>0){    
		   r=num%10;    //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  
		  if(temp==sum)    
		   System.out.println("palindrome number(True) ");    
		  else    
		   System.out.println("not palindrome(false) ");    
		}  
		 
		}  
