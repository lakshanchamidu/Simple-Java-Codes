import java.util.Scanner;
class array{
	public static String[] name_list = new String[10];
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		for(int i = 0;i< name_list.length;i++){
			System.out.print("Enter the Name");
			String name = input.next();
			if(name_list[i]==null){
				name_list[i] = name;
			}
		}
		for(int j = 0;j<name_list.length;j++){
			System.out.print(name_list[j]+" ");
		}
	}
}