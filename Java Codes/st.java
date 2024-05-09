import java.util.Scanner;
class st{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number");
		int number = input.nextInt();
		for(int i =0;i <= number; i++){
			if(i != 0 ){
				String x = "*";
				System.out.println(x.repeat(number));
				number-=1;
			}
		}
	}
}