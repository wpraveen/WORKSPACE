package com.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

/*
 * Concepts
 * 
 * 1. FileNotFoundException is sub class of IOException
 * 
 * 2. Its ok, even though i am no using the the byte array version of inputStream.read as data is already in buffer as we are using
 * buffer reader, hence data is just coming from buffer.
 * 
 */
class BufferedStreamer
{

	public BufferedInputStream getBufferedInputStream(File file)
	{
		
		BufferedInputStream inputStream = null;
		try
		{
			inputStream = new BufferedInputStream(new FileInputStream(file));
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Input File Not Found");
		}

		return inputStream;
	}

	public BufferedOutputStream getBufferedOutputStream(File file)
	{
		BufferedOutputStream outputStream = null;
		try
		{
			outputStream = new BufferedOutputStream(new FileOutputStream(file));
		}
		catch (FileNotFoundException exc)
		{
			System.out.println("Input File Not Found");
		}

		return outputStream;
	}
	
	public void fileCopyier(BufferedInputStream inputStream,BufferedOutputStream outputStream) throws IOException
	{
		int i;
		do
		{
			i = inputStream.read();
			if (i != -1)
				outputStream.write(i);
		} while (i != -1);
	}

}

public class BufferedStreamTest
{
	public static void main(String[] args)
	{
		System.out.println("Process start: ");
		BufferedStreamer bufferedStreamer = new BufferedStreamer();
		BufferedInputStream inputStream = null;
		BufferedOutputStream outputStream = null;
		File inputFile = new File("c:/input.txt");
		File outputFile = new File("c:/output.txt");

		try
		{
			inputStream = bufferedStreamer.getBufferedInputStream(inputFile);
			outputStream = bufferedStreamer.getBufferedOutputStream(outputFile);

			if (inputStream == null)
			{
				System.out.println("Can't open input stream");
				System.exit(0);
			}
			if (outputStream == null)
			{
				System.out.println("Can't open output stream");
				System.exit(0);
			}

			bufferedStreamer.fileCopyier(inputStream, outputStream);
		}
		catch (IOException exc)
		{
			System.out.println("File Error");
			exc.printStackTrace();
		}
		finally
		{
			try
			{
				if (inputStream != null)
				{
					inputStream.close();
				}
				if (outputStream != null)
				{
					outputStream.flush();
					outputStream.close();
				}
			}
			catch (IOException e)
			{
				
				
			}
			System.out.println("Process end");
		}
	}
}
