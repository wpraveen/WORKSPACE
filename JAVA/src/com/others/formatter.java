/** *************************************************************************** */
/* FILE HEADER */
/** *************************************************************************** */
/*                                                                            */
/* FileName : formatter.java */
/*                                                                            */
/* Author : k_praveen, THBS */
/*                                                                            */
/* Date : Sep 2, 2008 */
/*                                                                            */
/* Description : <Class Description> */
/*                                                                            */
/*                                                                            */
/** *************************************************************************** */
package nonweb.utils;

import java.math.BigDecimal;

public class formatter
{
    public static void main(String[] args)
    {
        BigDecimal n = new BigDecimal("1.23E09");
        try
        {
            while (true)
            {
                n = n.setScale(n.scale() - 1);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println(n.toPlainString());
        }
        System.out.println(n.toPlainString());
        System.out.println(n.toEngineeringString());
        System.out.println(n.toString());
    }
}
