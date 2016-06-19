package com.module.fileupload;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig
public class FileUploadController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET: Inside FileUploadController");
		//Serve any origin.
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().print("Hello from server.");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST: Inside FileUploadController");
		
		
		writeFile(request.getPart("file"));
		
		String name = getValue(request.getPart("name"));
		System.out.println("name: " + name);
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().print("Hello from server.");
	}
	
	private static String getValue(Part part) throws IOException {
		System.out.println("part: " + part);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream()));
	    StringBuilder value = new StringBuilder();
	    char[] buffer = new char[1024];
	    for (int length = 0; (length = reader.read(buffer)) > 0;) {
	        value.append(buffer, 0, length);
	    }
	    return value.toString();
	}
	
	
	private static void writeFile(Part part){
		InputStream inputStream = null;
		OutputStream outputStream = null;
	 
		try {
			inputStream = part.getInputStream();
			outputStream = 
	                    new FileOutputStream(new File("/Users/psingh7/Downloads/upload-image.jpg"));
	 
			int read = 0;
			byte[] bytes = new byte[1024];
	 
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
	 
			System.out.println("Done!");
	 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					// outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	 
			}
		}
	}

}
