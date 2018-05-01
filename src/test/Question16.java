package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		File inputFile = new File("c:\\ocjp\\data.txt");

		ArrayList<String> question = new ArrayList<>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(inputFile));

			String str;
			while((str = in.readLine()) != null) {
				question.add(str);

			}
		} catch (FileNotFoundException e) {
			StackTraceElement[] ste = e.getStackTrace();
			System.out.println(e.getClass().getName() + ": データが見つかりません。");
			for(int i = 0; i < ste.length; i++) {
				System.out.println(ste[i]);
			}
			System.exit(0);
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

		Collections.shuffle(question);
		
		System.out.println("タイピングゲームを開始します。");
		System.out.print("何かキーを入力してください : ");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();

		System.out.println();

		LocalTime start = LocalTime.now();
		int words = 0;
		for(int questionCount = 0; questionCount < 5; questionCount++) {

			System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊　第" + (questionCount + 1) + "問　＊＊＊＊＊＊＊＊＊＊＊＊");

			System.out.println();

			String[] str = question.get(questionCount).split(",", 0);
			for(String s : str) {
				System.out.println(s);
			}
			words += str[1].length();

			String answer;
			do {
				System.out.println();
				System.out.println("【入力してください】");
				answer = scn.nextLine();
			}while(answer.equals(str[1]) == false);
			System.out.println();
		}
		scn.close();

		LocalTime finish = LocalTime.now();
		long time = start.until(finish, ChronoUnit.SECONDS);
		BigDecimal bi = new BigDecimal(String.valueOf((double)words / (double)time));
		double words_per_second = bi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊　成績　＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("時間 : " + time + "秒");
		System.out.println("文字数 : " + words + "文字");
		System.out.print("一秒あたり : ");
		System.out.printf("%.1f", words_per_second);
		System.out.println("文字");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
	}

}
