package Numeric_Pattern;

public class Print_Odd_Even_Num {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2!=0) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(2+" ");
				}
			}
			System.out.println();
		}
	}

}
