package junittask;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoCharsTesting
{
static RemoveFirstTwoChars removefirsttwocharsobject;
	@BeforeAll
	static void objectCreation()
	{
	removefirsttwocharsobject=new RemoveFirstTwoChars();
	}
	@Test
	void test4charsOne() 
		{
		assertEquals("BCD",removefirsttwocharsobject.removeChars("ABCD"));
		}
	@Test
	void test4charsTwo() 
		{
		assertEquals("CD",removefirsttwocharsobject.removeChars("AACD"));
		}
	@Test
	void test4charsThree() 
		{
		assertEquals("BCD",removefirsttwocharsobject.removeChars("BACD"));
		}
	@Test
		void test4charsFour() 
	      {
		assertEquals("BBAA",removefirsttwocharsobject.removeChars("BBAA"));
	      }
	@Test
		void test5chars() 
		{
		assertEquals("BAA",removefirsttwocharsobject.removeChars("AABAA"));
		}
	@Test
	void test0chars()
	{
		assertEquals("",removefirsttwocharsobject.removeChars(""));
	}
	@Test
	void test1charsOne()
	{
		assertEquals("",removefirsttwocharsobject.removeChars("A"));
	}
	@Test
	void test1charsTwo()
	{
		assertEquals("B",removefirsttwocharsobject.removeChars("B"));
	}
	@Test
	void test2charsOne()
	{
		assertEquals("BB",removefirsttwocharsobject.removeChars("BB"));
	}
	@Test
	void test2charsTwo()
	{
		assertEquals("B",removefirsttwocharsobject.removeChars("AB"));
	}
	@Test
	void test2charsThree()
	{
		assertEquals("B",removefirsttwocharsobject.removeChars("BA"));
	}
	@Test
	void test2charsFour()
	{
		assertEquals("",removefirsttwocharsobject.removeChars("AA"));
	}
	@Test
	void test3charsOne()
	{
		assertEquals("BB",removefirsttwocharsobject.removeChars("ABB"));
	}
	@Test
	void test3charsTwo()
	{
		assertEquals("BBB",removefirsttwocharsobject.removeChars("BBB"));
	}
	@Test
	void test3charsThree()
	{
		assertEquals("B",removefirsttwocharsobject.removeChars("AAB"));
	}
	@Test
	void test3charsFour()
	{
		assertEquals("aA",removefirsttwocharsobject.removeChars("AaA"));
	}	
}
