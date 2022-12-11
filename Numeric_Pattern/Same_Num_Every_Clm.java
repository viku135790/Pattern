package Numeric_Pattern;

//Print same number in every colomn
public class Same_Num_Every_Clm {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
