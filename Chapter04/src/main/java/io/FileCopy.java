package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		FileOutputStream os = null;

		try {
			is = new FileInputStream("hh.jpg");
			os = new FileOutputStream("hh.copy.jpg");
			int data = -1;
			while ((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found" + e);

		} catch (IOException e) {
			System.out.println("error" + e);
		} finally {
			try {
				if (is != null)
					is.close();
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
