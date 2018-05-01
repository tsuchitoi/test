package Practice;

import java.util.ArrayList;

public class Question02 {

	public static void main(String[] args) {
		ArrayList<Katana> katana1 = new ArrayList<>();
		katana1.add(new Katana("大包平", "太刀", "オオカネヒラ"));
		katana1.add(new Katana("鬼切丸", "太刀", "オニキリマル"));
		katana1.add(new Katana("和泉守兼定", "打刀", "イズミノカミカネサダ"));
	
	for(int i = 0; i < katana1.size(); i++) {
		katana1.get(i).show();
	}
	}

}

class Katana{
	String name;
	String type;
	String kana;
	Katana(String n, String t, String k){
		name = n;
		type = t;
		kana = k;
	}
	public void show() {
		System.out.println("名前 : " + name + "、種類 : " + type + "読み仮名 : " + kana);
	}
}