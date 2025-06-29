package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問4
		System.out.println("-----問4-----");
		
		int[] firstNum = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] secondNum = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i = 0;
		
		while(i < firstNum.length) {
			for(int j = 0; j < secondNum.length; j++) {
				String firstZero = String.format("%02d", firstNum[i]);
				String secondZero = String.format("%02d", secondNum[j]);
				String result = String.format("%02d", firstNum[i] * secondNum[j]);
				System.out.print((firstZero + " ＊ " + secondZero + " = ") + result + " || ");
			}
			System.out.println(" ");
			i++;
		}
		
	}

}
