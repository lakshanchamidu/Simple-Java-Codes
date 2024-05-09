//import java.util.Scanner;
//public class Array1{
//	public static String[] namelist = new String[5];
//}

import java.util.Random;
public class Array1{
    public static int[] numberlist = new int[10];
    public static void main(String[] args){
        Random rand = new Random();
        for(int i = 0; i< numberlist.length;i++) {
            int a = rand.nextInt(101);
            if (numberlist[i]==null){
                numberlist[i] = a;
            }
        }
    }
}


























//import java.util.*;
//public class Array1{
//	public static String[] namelist = new String[10];
//	public static void main(String[] args){
//		Scanner input = new Scanner (System.in);
//		for(int i =0;i<namelist.length;i++){
//			System.out.print("Enter the name: ");
//			String name = input.next();
//			if (namelist[i]==null){
//				namelist[i] = name;
//			}
//
//		}
//		for(int j = 0;j< namelist.length;j++){
//			System.out.println(namelist[j]+ " ");
//		}
//	}
//
//
//}