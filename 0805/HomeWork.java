import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args){
	    // ��ӡ������
		/*int line = 5;// �����ε�������5��5��
		for(int i=1;i<=line;i++){// ������
		    for(int j=1;j<=line;j++){// ������
			    if(i==1 || i==line){// ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				    System.out.print("*");
				}else if(j==1 || j==line){// ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				    System.out.print("*");
				}else{
				    System.out.print(" ");// ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
				}
			}
			System.out.print("\n");//����
		}*/
		
        // ��ӡ�žų˷���
		/*for (int rowIndex = 1; rowIndex <= 9; rowIndex++) {
            for (int colIndex = 1; colIndex <= rowIndex; colIndex++) {
                int result = rowIndex * colIndex;
                System.out.print(colIndex + "*" + rowIndex + "=" + result + "\t");
            }

            System.out.println();
        }*/
		
		/*int line = 11;// �����ε�������5��5��
		for(int i=1;i<=line;i++){// ������
		    for(int j=1;j<=line;j++){// ������
			    if(i==1 || i==line){// ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				    System.out.print("* ");
				}else if(j==1 || j==line){// ����ǵ�һ�л��������һ�����ӡ�Ǻ�
				    System.out.print("* ");
				}else{
				    System.out.print("  ");// ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
				}
			}
			System.out.print("\n");//����
		}*/
		
		// ����������������n�ɱ䣬���ݴ�С����n�ɱ����������С

        /*int n = 5;
        drawHouse(n);
        }
		public static void drawHouse(int n) {
		// up��house�ϰ벿
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
		// �����°벿������
		// ǽ�� (int) Math.ceil(n * 3 / 5); ����ȡ�����ɱ�������ǽ�ڵĸ߶�
		int m = (int) Math.ceil(n * 3 / 5); // m��ǽ�ڸ߶�
		for (int i = 1; i <= m + 2; i++){ //����m + 2,��Ϊ�����°벿���ε��ܸ߶�
		    for (int j = 1; j <= n * 2 + 3; j++){
		        if (i == 1 || i == m + 2){ // �����ϲ����²�
		            System.out.print("*");
		}else if(j == 1 || j == n * 2 + 3){ // ǽ��
		    System.out.print("*");
		}else{
		    System.out.print(" ");
		}
			}
		System.out.println();
		}*/

		 // ���ڸ�����������: ����A��{1,7,9,11,13,15,17,19} 
		 // ����B��{2,4,6,8,10} ��������ϲ�Ϊ����c
		/*int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));*/

		// ��ӡ��100-9999�е�"ˮ�ɻ���",153��һ��"ˮ�ɻ���",
		// ��Ϊ152=1�����η�+5�����η�+3�����η�,
		// ����forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ
		/*System.out.println("100~999֮���ˮ�ɻ����У�");
		for(int i = 100;i <= 999;i++){
			int units = i % 10;
			int tens = i /10 % 10;
			int hundreds = i /10 /10 % 10;
			if(i == (units * units * units)+(tens * tens * tens)+(hundreds * hundreds * hundreds)){
				System.out.println(i);
			}
		}*/
		
		// ������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�
		/*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 3) {
                sum += i;
            }
        }
        System.out.println(sum);*/
		
		// һ�������ǡ�õ�����������֮��,������ͳ�Ϊ"����".
		// ����6=1+2+3.���:�ҳ�1000���ڵ���������
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
		
		// һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,
		// �����£������ڵ�ʮ�����ʱ,������������?��10�η������?
		/*double sum1 = 0,sum2 = 0,hight = 100.0;
		for(int i=0;i<10;i++){
			sum1=sum1+hight;
			hight=hight/2;
			if(i<9)
			{
				sum2=sum2+hight;
			}
		}
		System.out.println("��ʮ�����ʱ����"+(sum1+sum2)+"��");
		System.out.println("��ʮ�η����߶�"+hight+"��");*/
		
		// ��Ŀ����ӡ����������Σ�Ҫ���ӡ��10��)	
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
	
		// һ��ԪǮ��ټ�,����ÿֻ��Ԫ��ĸ��ÿֻ��Ԫ�� С����С��Ǯ�ͣ�
		// ��ֻС����һԪ,����ĸ����С������������м��ֹ��򷽷�?
		/*for(int i=1;i<20;i++){   // �����۸�
			for(int j=1;j<34;j++){  // ĸ���۸�
				for(int k=3;k<300;k+=3){  
					if((i+j+k==100)&&(5*i+3*j+k/3==100)){
						System.out.print("������ֻ��Ϊ��"+i);
						System.out.print("ĸ����ֻ��Ϊ��"+j);
						System.out.print("С����ֻ��Ϊ��"+k);
						System.out.print("\n");
					}
				}
			}
		}*/
		
		// �ŵ�����:��һ������,�ӳ��������������ÿ���¶���һ������,
		// С���ӳ����������º�ÿ��������һ������,�������Ӷ�����,��ÿ���µ���������Ϊ����?
		
		
		
		// ��n����Χ��һȦ,˳���ź�,�ӵ�һ���˿�ʼ����(��1��3����),
		// ������3�����˳�Ȧ��,��������µ���ԭ���ڼ��ŵ���λ
		
		// ��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ�
		// ���ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣�
		// �ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
		Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
			// ��λ
			int first = num%10;
			// ʮλ
			int sec = num/10%10;
			// ��λ
			int thrid = num/100%10;
			// ǧλ
			int forth = num/1000;
			// ��λ��5
			first = (first+5)%10;
			sec = (sec+5)%10;
			thrid = (thrid+5)%10;
			forth = (forth+5)%10;
			int result = first*1000+thrid*10+sec*100+forth;
			System.out.print(result);
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}