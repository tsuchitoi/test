package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3_2 {

	public static void main(String[] args) {
		//コピー元のファイル
		File inputFile = new File("c:\\ocjp\\ocjp.txt");
		//コピー先のファイル（なかったら作られる）
		File outputFile = new File("c:\\ocjp\\ocjpcopy.txt");


		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//実際にコピー元のファイルを送るもの
			in = new FileInputStream(inputFile);
			//実際にコピー先のファイルに送るもの
			out = new FileOutputStream(outputFile);

			//2進数でデータを送る
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
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
			} catch (IOException e) {
				e.printStackTrace();
			}
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
