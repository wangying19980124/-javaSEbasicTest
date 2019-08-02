import java.util.Scanner;

public class Square{
    public static void main(String[] args){
	    Scanner input = new Scanner (System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		int squ = num * num;
		System.out.println(num+"的平方是："+squ);
	}
}
		