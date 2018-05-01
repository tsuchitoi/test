package practice0425;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("CryptDecode(復号化)");
		System.out.println("------------------------");
		System.out.print("ファイル名 : ");
		File inputFile = new File("C:\\output\\" + scn.nextLine());
		scn.close();
		StringBuilder a = new StringBuilder();
		FileInputStream in = null;
		try {
			in = new FileInputStream(inputFile);

			int c;
			while((c = in.read()) != -1) {
				a.append((char)(c - 1));
				System.out.print(".");
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("データ : ");
		System.out.println(a.toString());
	}

}
