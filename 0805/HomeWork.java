import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args){
	    // 打印正方形
		/*int line = 5;// 正方形的总行数5行5列
		for(int i=1;i<=line;i++){// 控制行
		    for(int j=1;j<=line;j++){// 控制列
			    if(i==1 || i==line){// 如果是第一行或者是最后一行则打印星号
				    System.out.print("*");
				}else if(j==1 || j==line){// 如果是第一列或者是最后一列则打印星号
				    System.out.print("*");
				}else{
				    System.out.print(" ");// 如果不是第一行、最后一行、第一列、最后一列则打印空格
				}
			}
			System.out.print("\n");//换行
		}*/
		
        // 打印九九乘法表
		/*for (int rowIndex = 1; rowIndex <= 9; rowIndex++) {
            for (int colIndex = 1; colIndex <= rowIndex; colIndex++) {
                int result = rowIndex * colIndex;
                System.out.print(colIndex + "*" + rowIndex + "=" + result + "\t");
            }

            System.out.println();
        }*/
		
		/*int line = 11;// 正方形的总行数5行5列
		for(int i=1;i<=line;i++){// 控制行
		    for(int j=1;j<=line;j++){// 控制列
			    if(i==1 || i==line){// 如果是第一行或者是最后一行则打印星号
				    System.out.print("* ");
				}else if(j==1 || j==line){// 如果是第一列或者是最后一列则打印星号
				    System.out.print("* ");
				}else{
				    System.out.print("  ");// 如果不是第一行、最后一行、第一列、最后一列则打印空格
				}
			}
			System.out.print("\n");//换行
		}*/
		
		// 房顶的行数，行数n可变，房屋大小可随n成比例增大或缩小

        /*int n = 5;
        drawHouse(n);
        }
		public static void drawHouse(int n) {
		// up：house上半部
		for (int i = 1; i <= n; i++){
		    for (int j = 1; j <= 2 * n; j++){
		        if (j == n - i + 1){
		            System.out.print("*****");
		}else if (j == n + i - 1){
		    System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}
		System.out.println();
		}
		// 房屋下半部，矩形
		// 墙壁 (int) Math.ceil(n * 3 / 5); 向上取整，成比例增高墙壁的高度
		int m = (int) Math.ceil(n * 3 / 5); // m：墙壁高度
		for (int i = 1; i <= m + 2; i++){ //矩形m + 2,，为房屋下半部矩形的总高度
		    for (int j = 1; j <= n * 2 + 3; j++){
		        if (i == 1 || i == m + 2){ // 矩形上部，下部
		            System.out.print("*");
		}else if(j == 1 || j == n * 2 + 3){ // 墙壁
		    System.out.print("*");
		}else{
		    System.out.print(" ");
		}
			}
		System.out.println();
		}*/

		 // 现在给出两个数组: 数组A：{1,7,9,11,13,15,17,19} 
		 // 数组B：{2,4,6,8,10} 两个数组合并为数组c
		/*int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));*/

		// 打印出100-9999中的"水仙花数",153是一个"水仙花数",
		// 因为152=1的三次方+5的三次方+3的三次方,
		// 利用for循环控制100-999个数，每个数分解出个位、十位、百位
		/*System.out.println("100~999之间的水仙花数有：");
		for(int i = 100;i <= 999;i++){
			int units = i % 10;
			int tens = i /10 % 10;
			int hundreds = i /10 /10 % 10;
			if(i == (units * units * units)+(tens * tens * tens)+(hundreds * hundreds * hundreds)){
				System.out.println(i);
			}
		}*/
		
		// 求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）
		/*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 3) {
                sum += i;
            }
        }
        System.out.println(sum);*/
		
		// 一个数如果恰好等于它的因子之和,这个数就成为"完数".
		// 例如6=1+2+3.编程:找出1000以内的所有完数
		/*for(int i=1;i<1000;i++){
		    int sum=0;
		for(int j=1;j<i/2+1;j++){
			if(i%j==0){
				sum+=j;
			if(sum==i){
				System.out.println(i+" ");
			}
			}
		}
		}*/
		
		// 一个小球从100高度自由落下,每次落地后反跳回原高度的一半,
		// 再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?
		/*double sum1 = 0,sum2 = 0,hight = 100.0;
		for(int i=0;i<10;i++){
			sum1=sum1+hight;
			hight=hight/2;
			if(i<9)
			{
				sum2=sum2+hight;
			}
		}
		System.out.println("第十次落地时经过"+(sum1+sum2)+"米");
		System.out.println("第十次反弹高度"+hight+"米");*/
		
		// 题目：打印出杨辉三角形（要求打印出10行)	
		/*int[][]a=new int[10][10];
		for(int i=0;i<10;i++){
			a[i][i]=1;
		    a[i][0]=1;
		}
		for(int i=2;i<10;i++){
			for(int j=1;j<i;j++){
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		for(int i=0;i<10;i++){
			for(int k=0;k<2*(10-i)-1;k++){
				System.out.print("  ");
			}
		for(int j=0;j<=i;j++){
			System.out.print(a[i][j]+"     ");
		}
		System.out.println();
	}*/
	
		// 一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，
		// 三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
		/*for(int i=1;i<20;i++){   // 公鸡价格
			for(int j=1;j<34;j++){  // 母鸡价格
				for(int k=3;k<300;k+=3){  
					if((i+j+k==100)&&(5*i+3*j+k/3==100)){
						System.out.print("公鸡的只数为："+i);
						System.out.print("母鸡的只数为："+j);
						System.out.print("小鸡的只数为："+k);
						System.out.print("\n");
					}
				}
			}
		}*/
		
		// 古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,
		// 小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?
		
		
		
		// 有n个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),
		// 凡报道3的人退出圈子,问最后留下的是原来第几号的那位
		
		// 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
		// 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
		// 再将第一位和第四位交换，第二位和第三位交换。
		Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
			// 个位
			int first = num%10;
			// 十位
			int sec = num/10%10;
			// 百位
			int thrid = num/100%10;
			// 千位
			int forth = num/1000;
			// 各位加5
			first = (first+5)%10;
			sec = (sec+5)%10;
			thrid = (thrid+5)%10;
			forth = (forth+5)%10;
			int result = first*1000+thrid*10+sec*100+forth;
			System.out.print(result);
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}