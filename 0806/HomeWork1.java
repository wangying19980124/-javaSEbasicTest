import java.util.Scanner;
public class HomeWork1{
    public static void main(String[] args){ 
		// 古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,
		// 小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?
		System.out.println("问每个月的兔子总数为多少?");
				Scanner scanner = new Scanner(System.in);
				int ri = scanner.nextInt();
				if(ri<=2) {
					System.out.println("该月有1对兔子");
				}else {
					int f1 = 1;
					int f2 = 0;
					int f =f1+f2;
					for(int i = 2;i<=ri;i++) {
						f1=f2;
						f2=f;
						f=f1+f2;
						
					}System.out.println(f);
					}
	}
}