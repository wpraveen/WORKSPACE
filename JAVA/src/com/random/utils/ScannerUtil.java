/******************************************************************************/
/*                             FILE HEADER                                    */
/******************************************************************************/
/*                                                                            */
/*  FileName    : ScannerUtil.java                                                */
/*                                                                            */
/*  Author      : k_praveen, THBS                                               */
/*                                                                            */
/*  Date        : Jul 2, 2008                                                     */
/*                                                                            */
/*  Description : <Class Description>                                         */
/*                                                                            */
/*                                                                            */
/******************************************************************************/
package nonweb.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerUtil
{
    public static void main(String[] args) 
    {
        try {           
             Scanner scanner = new Scanner(new File("c:/test.txt"));             
            
            // scanner.useDelimiter(",");
             while (scanner.hasNext()) {
               System.out.println("**** : " + scanner.next());
             }
              scanner.close();
           } catch (FileNotFoundException e) {
             e.printStackTrace();
            
           }
    }
}
