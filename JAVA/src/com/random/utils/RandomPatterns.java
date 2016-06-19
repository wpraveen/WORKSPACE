/******************************************************************************/
/*                             FILE HEADER                                    */
/******************************************************************************/
/*                                                                            */
/*  FileName    : AlphaNumericRandomNumber.java                                                */
/*                                                                            */
/*  Author      : k_praveen, THBS                                               */
/*                                                                            */
/*  Date        : Jul 24, 2008                                                     */
/*                                                                            */
/*  Description : <Class Description>                                         */
/*                                                                            */
/*                                                                            */
/******************************************************************************/
package nonweb.utils;
import java.util.UUID;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class RandomPatterns
{
    final static private int LENGTH = 30;  
    
    public static void main(String[] args)
    {      
    	
System.out.println("no : " + RandomUtils.nextInt(10));    	
    	
        System.out.println(RandomStringUtils.randomAscii(LENGTH));
        System.out.println(RandomStringUtils.randomNumeric(LENGTH));
        System.out.println(RandomStringUtils.randomAlphabetic(LENGTH));
        System.out.println(RandomStringUtils.randomAlphanumeric(LENGTH));
        
        char[] aChars = new char[] { '1', '2', '3', '4', '5', '6', '7','8', '9', 'A', 'B', 'C', 'D', 'E'};
        System.out.println(RandomStringUtils.random(6,aChars));
        System.out.println(RandomStringUtils.random(6,"123456789ABCDE"));
        
        /*
         * 2nd and 3rd field work only with 6th field as 2nd -> start of array
         * 3rd -> end of array.
         */        
        
        System.out.println(RandomStringUtils.random(LENGTH, 0, 3, true, true, aChars));
       
      
        // Random Alphanumeric by UUID.
        String name = new String();
        UUID uuid = UUID.randomUUID();
        // Do not work with more than 36 chars.
        System.out.println(uuid.toString().substring(0, 36));
       
       // Random pattern by UID.
        String uid = new java.rmi.server.UID().toString(); // guaranteed unique
        System.out.println(uid);    
    
    }
}
