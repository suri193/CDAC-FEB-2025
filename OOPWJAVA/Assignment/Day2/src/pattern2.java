import java.util.Scanner;
public class pattern2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:->");
		int n = sc.nextInt();
		 
		for(int i=n;i>=0;i--){
			for(int j =i;j<n;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}