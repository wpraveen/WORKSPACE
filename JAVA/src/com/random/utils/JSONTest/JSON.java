package nonweb.utils.JSONTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class User
{
	private String firstName;
	private String lastName;
	private PhoneNumber phoneNumber;

	public PhoneNumber getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}



}

class PhoneNumber
{
	String phoneNumber;

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString()
	{
		return phoneNumber;
	}
}


/**
 * 
 * <Description JSON:> No way to use bean or Level 2 system.
 * @author THBS
 * @version 1.0
 * @see
 */
public class JSON
{
	public static void main(String[] args)
	{

		User me = new User();
		me.setFirstName("Praveen");
		me.setLastName("Kumar");
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPhoneNumber("9886641710");

		me.setPhoneNumber(phoneNumber);
		
		JSONObject jsonObject = new JSONObject();
		
		try
		{
			jsonObject.append("test", me);
			
		
		} catch (JSONException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(jsonObject.toString());

	}
}
