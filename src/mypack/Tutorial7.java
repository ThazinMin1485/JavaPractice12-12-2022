package mypack;

import java.util.Scanner;

public class Tutorial7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int a;
		for (int i = 1; i <= 10; i++) {
			if (i == 1 || i == 2) {
				System.out.print(i + " ");
				arr[i - 1] = i;
			} else {
				a = arr[i - 2] + arr[i - 3];
				System.out.print(a + " ");
				arr[i - 1] = a;
			}
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to test if it is Palindrome or not");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		String reverse=sb.reverse().toString();
		if(s.equals(reverse)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}

}
