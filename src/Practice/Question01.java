package Practice;

import java.util.ArrayList;

public class Question01 {

	public static void main(String[] args) {
		Game[] game1 = {new Game("スプラトゥーン2", "シューティング", 712),
						new Game("モンスターハンターワールド", "アクションロールプレイングゲーム", 936),
						new Game("ドラゴンクエストⅪ", "ロールプレイングゲーム", 317)};
		for(int i = 0; i < game1.length; i++) {
			game1[i].show();
		}
		ArrayList<Game> game2 = new ArrayList<>();
		game2.add(new Game("スプラトゥーン", "シューティング", 712));
		game2.add(new Game("モンスターハンターワールド", "アクションロールプレイングゲーム", 936));
		game2.add(new Game("ドラゴンクエストⅪ", "ロールプレイングゲーム", 317));
		
		
	}

}

class Game{
	String name;
	String type;
	int sale;
	Game(String n, String t, int s){
		name = n;
		type = t;
		sale = s;
	}
	
	void show() {
		System.out.println("ゲーム名 : " + name + "、ジャンル : " + type + "、販売本数 : " + sale + "万");
	}
}
