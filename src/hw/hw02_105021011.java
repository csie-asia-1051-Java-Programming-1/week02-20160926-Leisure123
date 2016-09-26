package hw;
/*
 * Topic:已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("男生填1,女生填2:");
		int gender = scn.nextInt();
		System.out.print("請輸入身高:");
		int w = scn.nextInt();
		if(gender == 1){
			float sw = (w - 80)*0.7f;
			System.out.print("你的標準體重為:" + sw);
		}else{
			float sw = (w -70)*0.6f;
			System.out.print("你的邊準體重為:" + sw);
		}

	}

}
