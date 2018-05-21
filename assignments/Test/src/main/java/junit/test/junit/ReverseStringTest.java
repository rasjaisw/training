package junit.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.test.JunitReverseString;

public class ReverseStringTest {
  
  JunitReverseString jr = new JunitReverseString();
  @Test
  public void revString()
  {
	  assertEquals("condition failed", "ih !ereht ", jr.revString1("hi there!"));

  }

}
 