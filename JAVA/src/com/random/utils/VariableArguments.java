/******************************************************************************/
/*                             FILE HEADER                                    */
/******************************************************************************/
/*                                                                            */
/*  FileName    : VariableArguments.java                                                */
/*                                                                            */
/*  Author      : k_praveen, THBS                                               */
/*                                                                            */
/*  Date        : Sep 15, 2008                                                     */
/*                                                                            */
/*  Description : <Class Description>                                         */
/*                                                                            */
/*                                                                            */
/******************************************************************************/
package nonweb.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class VariableArguments
{
    static Class [] argTypes =
    {
       int.class
    };
     int sum (int ... numbers)
    {
       int total = 0;
       for (int i = 0; i < numbers.length; i++)
            total += numbers [i];
       System.out.println("inside sum");
       return total;
    }
    
    public static void main(String[] args)
    {
       
        
        Class c = null;
        try
        {
            c = Class.forName ("VariableArguments");
        }
        catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Method m = null;
        try
        {
            m = c.getMethod("sum", argTypes);
        }
        catch (SecurityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try
        {
            m.invoke (c.newInstance (),1,2,3);
        }
        catch (IllegalArgumentException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
