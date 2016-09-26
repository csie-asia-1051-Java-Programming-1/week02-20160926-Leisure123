package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex03_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("從");
		float a = scn.nextInt();
		float b = scn.nextInt();
		System.out.print("到");
		float c = scn.nextInt();
		float d = scn.nextInt();
		float p = 60*(c-a)+(d-b);
		float t = (float)Math.floor(p/30);
		if(t <= 4){
			float dollar = 30*t;
			System.out.print("需要付:" + dollar );
		}else{
			if(t > 4 && t <= 8){
				float dollar = 120+40*(t-4);
				System.out.print("需要付" + dollar );
			}else{
				if(t > 8 ){
					float dollar = 280+60*(t-8);
					System.out.print("需要付" + dollar );
				}
			}
			
			
		}
		

	}

}
