package practice0425;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

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
			for(int i = 0; i < date.length(); i++) {
				a = date.charAt(i) + 1;//char から int へ暗黙的型変換
				out.write(a);
				System.out.print(".");
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
