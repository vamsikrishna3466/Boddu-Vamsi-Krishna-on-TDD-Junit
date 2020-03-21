package junittask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RemoveFirstTwoChars 
{
	private String characterUpdation(String givenstring,int index)
	{
		String result="";
		char character=givenstring.charAt(index);
		if(character!='A')
		{
			result=result+character;
		}
		return result;
	}
	public static final Logger LOG=LogManager.getLogger("RemoveFirstTwoChars.class");
	public String removeChars(String givenstring)
	{
		LOG.debug("The given string is {} ",givenstring);
		int stringlength=givenstring.length();
		LOG.info("calculation of string length");
		LOG.info("intializing the output string");
		String result="";
		LOG.info("checking whether stringlength is zero or not");
		if(stringlength>0)
		{
				LOG.info("checking whether given stringlength is greater than or equal to 1");
				if(stringlength>=1)
				{
				result=result+this.characterUpdation(givenstring,0);
				LOG.debug("The output string after updating firstcharacter is {} ",result);	
				}
				LOG.info("checking whether given stringlength is greater than or equal to 2");
				if(stringlength>=2)
				{
					result=result+this.characterUpdation(givenstring,1);
					LOG.debug("The output string after updating secondcharacter is {} ",result);
				}
			
				LOG.info("checking whether given stringlength is greater than 2");
				if(stringlength>2)
				{
				result=result+givenstring.substring(2);
				}
		}
		LOG.debug("******************** The final string is {} ************************** ",result);
		return result;
}

}
