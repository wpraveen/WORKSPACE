package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
	public static void main(String[] args) {
		String fileData = "";
		String fileDataTemp = "";
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("FILE_PATH"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while ((fileDataTemp = reader.readLine()) != null) {
				fileData += fileDataTemp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fileData);
	}
}
