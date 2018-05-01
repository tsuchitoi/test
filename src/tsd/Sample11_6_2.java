package tsd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample11_6_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("ファイル名 : ");
		String file = scn.nextLine();
		scn.close();
		File inputFile = new File("c:\\ocjp\\" + file);
		File outputFile = new File("c:\\ocjp\\ocjpcopy_buff.txt");

		BufferedReader in = null;
		BufferedWriter out = null;
//		PrintWriter out = null;       書き込みのもう一つの方法（以下、コメントアウトした部分）
		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
//			out = new PrintWriter(new FileWriter(outputFile));

			System.out.println("<データ内容>");
			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
				System.out.println(line);
				out.newLine();
//				out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				System.out.println("read & write complete.");
			}
		}
	}
}
