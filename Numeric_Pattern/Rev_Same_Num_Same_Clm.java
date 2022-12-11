package Numeric_Pattern;
//Same number same clm Pyramid
public class Rev_Same_Num_Same_Clm {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
