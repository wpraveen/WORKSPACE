package nonweb.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest
{

	private static void testRegE(String candidate, String regex)
	{

		System.out
			.println("---------------------------------------------------");
		System.out.print("CANDIDATE : " + candidate + "\t");
		System.out.print("REGEX : " + regex + "\r");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(candidate);
		String val = null;

		while (m.find())
		{
			val = m.group();
			System.out.println("MATCH: |*|" + val + "|*|");
		}
		if (val == null)
		{
			System.out.println("NO MATCHES");
		}
		System.out
			.println("---------------------------------------------------");
		System.out.println();
	}

	private static void findMatchedToken(String str,String regEx)
	{
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);
		boolean matchFound = matcher.find();
System.out.println("CANDIDATE : "  +str);
		if (matchFound)
		{
			for (int i = 0; i <= matcher.groupCount(); i++)
			{
				String matchedStr = matcher.group(i);
				System.out.println("MATCHED TOKEN : |*|" + matchedStr + "|*|");
			}

		}
		else
		{
			System.out.println("NO MATCHED STRING FOUND");
		}
	}

	private static String getMatchedToken(String candidate, String regex)
	{
		regex = regex + ".*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(candidate);
		String val = null;

		if (m.find())
		{
			val = m.group();
		}
		if (val != null)
		{
			if (val.indexOf(" and ") > -1)
			{
				val = val.substring(0, val.indexOf(" and "));
			}
		}
		return val;
	}
	public static void main(String[] args)
	{

		// Simple Number matching.
		// RegExTest.testRegE("123", "12\\d");
		// RegExTest.findMatchedToken("123", "12\\d");
		// RegExTest.testRegE("1234", "12\\d");
		// RegExTest.testRegE("123", "12\\d\\d");

		// Email with underscore.
		// RegExTest.testRegE("k_praveen@thbs.com",
		// "(\\w+)_(\\w+)@(\\w+)\\.com");
		// RegExTest.testRegE("k_praveen@thbs.com",
		// "(\\w+)_(\\w+)@(\\w+)\\.org");
		// RegExTest.testRegE("k.praveen@thbs.com",
		// "(\\w+)_(\\w+)@(\\w+)\\.com");
		// RegExTest.testRegE("praveen@thbs.com", "(\\w+)_(\\w+)@(\\w+)\\.com");
		// RegExTest.testRegE("praveen@thbs.com", "(\\w+)@(\\w+)\\.com");

		// Email with dot (gmail style).
		// RegExTest.testRegE("praveen.k.sing@nokia.com",
		// "(\\w+\\.?){1,4}@(\\w+\\.?){1,3}");
		// RegExTest.testRegE("praveen.k.sing.one.two@nokia.com",
		// "(\\w+\\.?){1,4}@(\\w+\\.?){1,3}");
		// RegExTest.testRegE("praveen.k.sing@nokia.co.in.one",
		// "(\\w+\\.?){1,4}@(\\w+\\.?){1,3}");
		String str = "(client-uid = 102055eb and provisioning = thiufri4) and "
			+ "(client-uid = 102055eb and provisioning = 853ae90b or device-id = 15 ) and "
			+ "(device-id = 18 or device-id = 25 or device-id = 16)"
			+ "(client-uid = 102055eb and provisioning = 853ae90b) and "
			+ "(device = 14 or device-id = 15 or device-id = 16)";
		// RegExTest.testRegE(str,
		// "\\((((\\w+)((-(\\w+))*) = (\\p{Alnum}+) or )+)(\\w+)((-(\\w+))*) = (\\p{Alnum}+)\\)");

		// RegExTest.testRegE(str,
		// "(((\\w+)((-(\\w+))*) = (\\p{Alnum}+) or )+)(\\w+)((-(\\w+))*) = (\\p{Alnum}+)");

		str = "provisioning = 11ptest41 and client-version = 4.1.10 and provisioning = 11ptest41";
		//RegExTest.testRegE(str,"^(client-version = ((\\d+\\.)+)(\\d+)) and ");
		//RegExTest.testRegE(str,"(client-version = and ((\\d+\\.)+)(\\d+))$");
		//RegExTest.testRegE(str,"(client-version = ((\\d+\\.)+)(\\d+)) and ");
		//str = "(country-id = 84 and (  provisioning = download or  provisioning = DownloadUpgrade or  " +
			//	"provisioning = DownloadWeb or  provisioning = downloadOTA ) and " +
				//"(  device-id = 215 or  device-id = 194 or  device-id = 218 or  device-id = 221 or  " +
				//"device-id = 189 or  device-id = 195 or  device-id = 185 ))";
		//String regex = "\\(\\s*(((\\w+)((-(\\w+))*)\\s*=\\s*(\\p{Alnum}+)\\s*or\\s*)+)(\\w+)((-(\\w+))*)\\s*=\\s*(\\p{Alnum}+)\\s*\\)";
		//String regex = "\\(\\s*(\\w+)";
	//	RegExTest.testRegE(str,regex);
		
		str = "(smsc = 999913 and (  provisioning = download or  provisioning = DownloadUpgrade or  provisioning = DownloadWeb ) " +
				"and variant != true and softwareType != variant) and (  device-id = 101 or  device-id = 95 or  device-id = 106 or  device-id = 121 or  device-id = 119 or  device-id = 136 or  device-id = 93 or  device-id = 124 or  device-id = 88 or  device-id = 110 ) and (device-id = 98 and " +
				"(  firmware-version : RegExp = V 00\\..* or  firmware-version : RegExp = V 07\\..* or  firmware-version : RegExp = 007\\..* or  firmware-version : RegExp = 200\\..* )) " +
				"and (device-id = 129 and (  firmware-version : RegExp = V 01\\..* or  firmware-version : RegExp = V 02\\..* or  firmware-version : RegExp = V 10\\..* or  firmware-version : RegExp = V 11\\..* or  firmware-version : RegExp = V 20\\.0\\.01.* or  firmware-version : RegExp = V 20\\.0\\.02.* or  firmware-version : RegExp = V 20\\.0\\.03.* or  firmware-version : RegExp = V 20\\.0\\.04.* or  firmware-version : RegExp = V 20\\.0\\.05.* or  firmware-version : RegExp = V 20\\.0\\.060.* )) and (device-id = 85 and (  firmware-version : RegExp = V 10\\..* or  firmware-version : RegExp = V 11\\..* or  firmware-version : RegExp = V 12\\..* or  firmware-version : RegExp = V 13\\..* or  firmware-version : RegExp = V 14\\..* or  firmware-version : RegExp = V 15\\..* or  firmware-version : RegExp = V 20\\..* or  firmware-version : RegExp = V 21\\.0\\.00.* or  firmware-version : RegExp = V 21\\.0\\.010.* or  firmware-version : RegExp = V 21\\.0\\.011.* or  firmware-version : RegExp = V 21\\.0\\.012.* or  firmware-version : RegExp = V 21\\.0\\.013.* or  firmware-version : RegExp = V 21\\.0\\.014.* or  firmware-version : RegExp = V 21\\.0\\.015.* )) and (device-id = 120 and (  firmware-version : RegExp = V 1\\..* or  firmware-version : RegExp = V 10\\..* or  firmware-version : RegExp = V 11\\..* or  firmware-version : RegExp = V 12\\..* or  firmware-version : RegExp = V 120\\..* or  firmware-version : RegExp = V 15\\.0\\.00.* or  firmware-version : RegExp = V 15\\.0\\.010.* or  firmware-version : RegExp = V 15\\.0\\.011.* or  firmware-version : RegExp = V 15\\.0\\.012.* or  firmware-version : RegExp = V 15\\.0\\.013.* or  firmware-version : RegExp = V 15\\.0\\.014.* ))";
		
		
		//str = "and (device-id = 129 and (  firmware-version : RegExp = V 20\\.0\\.060.* )) and (device-id = 85 and (  firmware-version : RegExp != V 10\\..* or  firmware-version : RegExp = V 11\\..* or  firmware-version : RegExp = V 12\\..* or  firmware-version : RegExp = V 13\\..* or  firmware-version : RegExp = V 14\\..* or  firmware-version : RegExp = V 15\\..* or  firmware-version : RegExp = V 20\\..* or  firmware-version : RegExp = V 21\\.0\\.00.* or  firmware-version : RegExp = V 21\\.0\\.010.* or  firmware-version : RegExp = V 21\\.0\\.011.* or  firmware-version : RegExp = V 21\\.0\\.012.* or  firmware-version : RegExp = V 21\\.0\\.013.* or  firmware-version : RegExp = V 21\\.0\\.014.* or  firmware-version : RegExp = V 21\\.0\\.015.* )) and (device-id = 120 and (  firmware-version : RegExp = V 1\\..* or  firmware-version : RegExp = V 10\\..* or  firmware-version : RegExp = V 11\\..* or  firmware-version : RegExp = V 12\\..* or  firmware-version : RegExp = V 120\\..* or  firmware-version : RegExp = V 15\\.0\\.00.* or  firmware-version : RegExp = V 15\\.0\\.010.* or  firmware-version : RegExp = V 15\\.0\\.011.* or  firmware-version : RegExp = V 15\\.0\\.012.* or  firmware-version : RegExp = V 15\\.0\\.013.* or  firmware-version : RegExp = V 15\\.0\\.014.* ))";

		
		
//String regex = "\\(\\s*(((\\w+)((-(\\w+))*)\\s*=\\s*(\\p{Alnum}|\\p{Punct}+)\\s*or\\s*)+)(\\w+)((-(\\w+))*)\\s*=\\s*(\\p{Alnum}|\\p{Punct}+)\\s*\\)";
		
		//System.out.println(str.replaceAll("\\\\", "_BACK_SLASH_"));
		
		//String regex = "\\(\\s*(((\\w+)((-(\\w+))*)\\s*[=,!=]\\s*(\\p{Print}+)\\s*or\\s*)+)(\\w+)((-(\\w+))*)\\s*[=,!=]\\s*(\\p{Print}+)\\s*\\)";
		//String regex = "\\(((\\s*\\p{Graph}+\\s*)+=(\\s*\\p{Graph}+\\s*)+or)+(\\s*\\p{Graph}+\\s*)+\\s*=(\\s*\\p{Graph}+\\s*)+\\s+\\)";
		//String regex = "\\(" + "(" +"(\\w+|\\s:\\s|-|\\s*)*"  + "(=|!=)*" + "(\\s*|\\p{Graph}*)*" + "or" + ")+" +  "(\\w+|\\s:\\s|-|\\s*)+"  + "(=|!=)*" + "(\\s*|\\p{Graph}*)*" + "\\s*\\)";
		String regex = "(\\([^\\(]*\\))+";
		//RegExTest.testRegE(str,regex);
		
		str= "( ( ( provisioning = 853ae90b or provisioning = thiufri4 ) and ( device-id = 70 and operator-id = 5 and cookie : RegExp != .*Called-station-id=www.globe.com.ph.* ) ) or ( ( provisioning = 853ae90b or provisioning = thiufri4 ) and ( device-id = 70 and operator-id = 148 and x-nokia-msisdn : RegExp != .+ ) ) )";
		regex = "\\(.*\\sor\\s.*\\)";
		//RegExTest.testRegE(str,regex);
		
		
	// One alphabet and alphanumeric
		str= "s d";
		regex = "^\\d*[a-zA-Z][a-zA-Z0-9\\s]*$";
		RegExTest.testRegE(str,regex);
		
		str= "1a1";
		regex = "^\\d*$";
		RegExTest.testRegE(str,regex);
		
		
		 

		
		
	}
}
