package nonweb.utils;

import javax.mail.internet.AddressException;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class Emails
{

	public static void main(String[] args)
	{

		try
		{

			HtmlEmail email = new HtmlEmail();

			email.setHostName("smtp.Nokia.com");
			email.addTo("praveen.k.singh@nokia.com", "Praveen Kumar Singh");

			email.setFrom("praveen.k.singh@nokia.com", "Me");
		//	email.setAuthentication("USER_NAME", "PASS*");
			//email.setSSL(true);
			//email.setSmtpPort(25);
			email.setSubject("Test message");
			email
					.setMsg("<html><body><label style='color:maroon'>This is a simple test of commons-email</label></body></html>");

			try
			{
				email.getFromAddress().validate();
			} catch (AddressException e)
			{
				System.out.println("non valid email");
				e.printStackTrace();
			}

			System.out.println(email.send());

		} catch (EmailException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
