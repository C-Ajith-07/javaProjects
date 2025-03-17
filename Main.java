package project;
import java.util.Scanner;

//import java.util.Comparator;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		ArrayList01<String> arr = new ArrayList01<>();
		
		ArrayList01<Integer> list = new ArrayList01<>();
//		String ans="";
//		int Option = 0;
//		while(Option != 4) {
//			try {
//				System.out.println(" 1)Add the product \n 2)Remove the Product \n 3)viewDetails \n 4)exit");
//				Option = getInput.nextInt();
//			} catch (Exception e) {
//				e.getMessage();
//			}
//			getInput.nextLine();
//			if(Option == 1) {
//					System.out.println("enter the product name");
//					ans=getInput.nextLine();
//					arr.add(ans);	
////					System.out.println("dfghj");
//			}
//			else if(Option == 2) {
//				System.out.println("enter the product name");
//				ans=getInput.nextLine();
//				arr.remove(ans);
//			}
//			else if(Option == 3) {
//				System.out.println("Total products\n---------------");
//				arr.print();
//				System.out.print("\n");
//			}
//			else if(Option == 4) {
//				break;
//			}else {
//				System.out.println("enter the valid input");
//			}
////			System.out.println(arr.get(arr.size()));
//		}
		list.add(5);
		list.add(2);
		System.out.println("hii");
		list.addFirst(8);
		list.addLast(8);
		System.out.println(list.lastIndexOf(8));

	}
	
}


