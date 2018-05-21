package junit.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.test.JunitPalindrome;

public class PalindromeTest {
  
  static JunitPalindrome jp = new JunitPalindrome(); 
  
  @Test
  public void palTest()
  {
  assertTrue(jp.palindromeCheck(121));
  }

}