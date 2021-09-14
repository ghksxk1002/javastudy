package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반스트림
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");

			// 보조스트림
			br = new BufferedReader(fr);
			int index = 0;
			String line = null;

			try {
				while ((line = br.readLine()) != null) {
					index++;
					System.out.print(index);
					System.out.print(":");
					System.out.println(line);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not Found:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("=");

			}

		}
	}
}
