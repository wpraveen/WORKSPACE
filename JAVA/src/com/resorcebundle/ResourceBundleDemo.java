package nonweb.resorcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

class ResourceBundleTest
{

	private static ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle");
	
	
	
	private static ResourceBundle getResourceBundle(Locale locale)
	{
		if(locale == null)
		{
			return bundle;
		}
		else
		{
			return ResourceBundle.getBundle("MessagesBundle",locale);
			
		}
		
	}

	public static void doResourceBundleTest(String key, Locale locale)

	{
		System.out.println("Message : "  + bundle.getString(key));
	}
}

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundleTest.doResourceBundleTest("greeting", Locale.ENGLISH);
	}
}