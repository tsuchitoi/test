package practice0425;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("CryptEncode(暗号化)");
		System.out.println("------------------------");
		System.out.print("ファイル名 : ");
		File outputFile = new File("C:\\output\\" + scn.nextLine());
		System.out.print("データ : ");
		String date = scn.nextLine();
		scn.close();
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(outputFile);
			int a;
			int b = 0;
			for(int i = 0; i < date.length(); i++) {
				a = date.charAt(i);
				b += a;
			}
			System.out.println(b);
			int c = b % date.length();
			int d;
			for(int j = 0; j < date.length(); j++) {
				d = date.charAt(j) - c;
				out.write(d);
			}
			System.out.println();
			System.out.println("暗号化が終わりました。");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
