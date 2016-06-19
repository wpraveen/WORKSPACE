package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppender {
	final private static String FILE_PATH = "c:/logs/eclipse/eclipseLogs.txt";
	private static PrintWriter writer;

	public static PrintWriter getPWInstance() {
		try {
			if (writer == null) {
				FileAppender.writer = new PrintWriter(new BufferedWriter(
						new FileWriter(FILE_PATH, true)));
				return FileAppender.writer;
			} else {
				return FileAppender.writer;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer;

	}

	public static void append(String str) throws IOException {
		PrintWriter writer = FileAppender.getPWInstance();
		writer.println(str);
		writer.flush();

	}

	public static void main(String[] args) throws IOException {

		FileAppender.append("one");

		FileAppender.append("one");
		FileAppender.append("one");
	}

}
