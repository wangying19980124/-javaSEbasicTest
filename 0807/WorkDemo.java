import java.util.Scanner;


public class WorkDemo{
    public static void main(String[] args){
		// 1、已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序.
		// (知识点：变量和运算符综合应用) [必做题]  
	    /*int a = 100;
		int b = 200;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);*/
		// 2、给定一个0～1000的整数，求各位数的和，
		// 例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除
		//（知识点：变量和运算符综合应用） [必做题]
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		    // 个位
			int first = num%10;
			// 十位
			int sec = num/10%10;
			// 百位
			int thrid = num/100%10;
			// 千位
			int forth = num/1000;
			System.out.println(first+sec+thrid+forth);*/
		// 假设有整型变量x，判断x是否为偶数，若为偶数，
		// 则在控制台上打印“输入的数值是偶数”。
        /*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int x = num;
		if(x%2 == 0)
		{	
	        System.out.println("输入的数值是偶数"+x);
		}else{
			System.out.println("输入的数值是奇数"+x);
		}*/
		// 有两个整型变量x，y，请在控制台上输出x与y中值较大的那个数。
		/*Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
        int x = num1;
		int y = num2;
		if(x>y){
			System.out.println("x较大"+x);
		}else{
			System.out.println("y较大"+y);
		}*/
		// 计算1+2+3+…+100的和（提示利用while语句）
		/*int i = 1;
		int sum = 0;
		while(i<=100){
			sum += i;
         	i++;	
		}
		System.out.println(sum);*/
        // 计算从1到100的所有奇数相加（提示利用while语句）
		/*int i = 1;
		int sum = 0;
		while(i<=100){
			if(i%2==0){
			sum+=i;
			}i++;
		}
		System.out.println(sum);*/
        // 用do while 循环来改写1加到100
		/*int i = 1;
		int sum = 0;
		do{
			sum+=i++;
		}while(i<=100);
		System.out.println(sum);*/
		// 用for循环来改写1加到100
		/*int sum = 0;
		for(int i=1;i<=100;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);*/
		// 用for循环改写从1到100的所有奇数相加的和
		/*int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				continue;
			}else{
				sum =sum +i;
			}
		}
			System.out.println(sum);*/
		//企业发放的奖金根据利润提成。利润低于或等于10万元时，
		// 奖金可提10%；利润高于10万元，低于或等于20万元时，
		// 高于10万元的部分，可提成7.5%；高于20万，
		// 低于或等于40万时，高于20万元的部分，可提成5%；
		// 高于40万，低于或等于60万时，高于40万元的部分，
		// 可提成3%；高于60万，低于或等于100万时，高于60万元的部分，
		// 可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
		// 在程序中设定一个变量为当月利润，求应发放奖金总数？
		//（知识点：条件语句） [必做题]
		/*Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		double x = num;
		if(x<=10){
			x=10*10/100;
		}else if(x>10 && x<=20){
			x=10*10/100+(x-10)*7.5/100;
		}else if(x>20 && x<=40){
			x=10*10/100+(x-10)*7.5/100+(x-20)*5/100;
		}else if(x>40 && x<=60){
			x=10*10/100+(x-10)*7.5/100+(x-20)*5/100+(x-40)*3/100;
		}else if(x>60 && x<=100){
			x=10*10/100+(x-10)*7.5/100+(x-20)*5/100+(x-40)*3/100+(x-60)*1.5/100;
		}else{
			x=10*10/100+(x-10)*7.5/100+(x-20)*5/100+(x-40)*3/100+(x-60)*1.5/100+(x-100)*1/100;
		}
	    System.out.println(x);*/
		// 给定一个成绩a，使用switch结构求出a的等级。
		// A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch） [必做题]
		/*Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>100 || a<0){
			System.out.println("输入有误");
			return;
		}
		switch(a/10){
			case 10:
		    case 9:
		        System.out.println("A");
				break;
			case 8:
			    System.out.println("B");
				break;
		    case 7:
			    System.out.println("C");
				break;
			case 6:
			    System.out.println("D");
				break;
			default:
			    System.out.println("E");
				break;
		}*/
        // 假设某员工今年的年薪是30000元，年薪的年增长率6%。
		// 编写一个Java应用程序计算该员工10年后的年薪，
		// 并统计未来10年（从今年算起）总收入。（知识点：循环语句for）[选做题]
		/*int sum = 0;
		for(int i=0;i<=10;i++){
		    sum += 30000+(30000*6/100);
		}
		System.out.println(sum);*/
		// 猴子第一天摘下若干个桃子,当即吃了一半,还不瘾，又多吃了一个,
		// 第二天早上又将剩下的桃子吃掉一半,又多吃了一个.
		// 以后每天早上都吃了前一天剩下的一半零一个..
		// 到第10天早上想再吃时,见只剩下一个桃子了.求第一天共摘了多少.(知识点:循环)
		/*int num = 1;
		for(int i=10;i>1;i--){
			num = (num+1)*2;
		}
		System.out.println(num);*/
		// 输入一个数字，判断是一个奇数还是偶数(知识点：条件语句)[必做题]	
	    /*Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
		if(num%2 == 0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}*/
		// 编写程序， 判断一个变量x的值，如果是1，输出x=1，
		// 如果是5，输出x=5，如果是 10，输出x=10，
	    // 除了以上几个值，都输出x=none。（知识点：条件语句） [必做题]
		/*Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x==1){
			System.out.println("x=1");
		}else if(x==5){
			System.out.println("x=5");
		}else if(x==10){
			System.out.println("x=10");
		}else{
			System.out.println("x=none");
		}*/
		// 判断一个数字是否能被5和6同时整除（打印能被5和6整除），
		// 或只能被5整除（打印能被5整除），或只能被6整除，（打印能被6整除），
		// 不能被5或6整除，（打印不能被5或6整除）（知识点：条件语句） [必做题]
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num%5==0 && num%6==0){
			System.out.println("能被5和6整除");
		}else if(num%5==0 || num%6==0){
			System.out.println("只能被5整除或只能被6整除");
		}else{
			System.out.println("不能被5或6整除");
		}*/
		// 输入一个年份，判断这个年份是否是闰年
		//（知识点：条件、循环语句） [必做题]
	    /*Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
   		if(year%4==0 && year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"是平年");
		}*/
		// 输入一个0～100的分数，如果不是0～100之间，
		// 打印分数无效，根据分数等级打印A,B,C,D,E
		//（知识点：条件语句if elseif） [必做题]
		/*Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score>100 && score<0){
			System.out.println("分数无效");
		}else if(score>=90 && score<=100){
			System.out.println("A");
		}else if(score>=80 && score<89){
			System.out.println("B");
		}else if(score>=70 && score<79){
			System.out.println("C");
		}else if(score>=60 && score<69){
			System.out.println("D");
		}else{
			System.out.println("F");
		}*/
		// 输入三个整数x,y,z，
		// 请把这三个数由小到大输出（知识点：条件语句） [必做题]
        Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		if(x>y && x>z && y>z){
			System.out.println("x>y>z");
		}else if(x>y && x>z && z>y){
			System.out.println("x>z>y");
		}else if(x>y && x<z){
			System.out.println("z>x>y");
		}else if(x<y && x<z && z>y){
			System.out.println("z>y>x");
		}else if(y>x && y>z && x>z){
			System.out.println("y>x>z");
		}else{
			System.out.println("y>z>x");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}