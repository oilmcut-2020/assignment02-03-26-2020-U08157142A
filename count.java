package test;
import java.util.Scanner;
public class abc {

	public static void main(String[] args) {
		int num1,num2;
		int a;
		Scanner sca = new Scanner(System.in);
		System.out.println("Subtraction=1;\r\n" + 
				"multiplication=2;\r\n" + 
				"division=3：");
		a = sca.nextInt();
		if(a==1) 
		{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入兩個數字：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println(num1 - num2);
        }
		else if(a==2) 
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("請輸入兩個數字：");
	        num1 = scanner.nextInt();
	        num2 = scanner.nextInt();
	        System.out.println(num1 * num2);

	    }
		else if(a==3) 
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("請輸入兩個數字：");
	        num1 = scanner.nextInt();
	        num2 = scanner.nextInt();
	        System.out.println(num1 / num2);
    	}
}
}