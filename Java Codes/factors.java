import java.util.Scanner;

class factors{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		for(int i = 0; i <= 100; i++){
			if (i == 0){
				continue;
			}
			if((i % number) == 0){
				System.out.print(i+" ");
			}
		}
	}
}