package junit.test;

public class JunitPalindrome {

	public static boolean palindromeCheck(int number) {
	    if(number < 0) {
	      return false;
	    }
	    int reverseNum = reverseNumber(number);
	    if(reverseNum == number) {
	      return true;
	    }
	  return false;
	  }
	  
	  public static int reverseNumber(int num) {
	  int reverseNum = 0;
	  while(num != 0) {
	    int remainder = num % 10;
	    num /= 10;
	    reverseNum = reverseNum*10 +remainder;    
	  }
	//  System.out.println(reverseNum);
	  return reverseNum;
	  }

	}
