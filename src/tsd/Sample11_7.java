package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sample11_7 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Bulldog obj = new Bulldog();
		try {
			fos = new FileOutputStream(new File("c:\\ocjp\\dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("---- シリアライズ完了");
			
			fis = new FileInputStream(new File("c:\\ocjp\\dog.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog readobj = (Bulldog) ois.readObject();
			System.out.println("---- デシリアライズ完了");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				ois.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
class Animal1{
	Animal1(){
		System.out.println("Animal()");
	}
}
class Dogs1 extends Animal1  implements Serializable{
	Dogs1(){
		System.out.println("Dogs()");
	}
}
class Bulldog extends Dogs1{
	
}
