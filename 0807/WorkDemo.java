import java.util.Scanner;


public class WorkDemo{
    public static void main(String[] args){
		// 1����֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���.
		// (֪ʶ�㣺������������ۺ�Ӧ��) [������]  
	    /*int a = 100;
		int b = 200;
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);*/
		// 2������һ��0��1000�����������λ���ĺͣ�
		// ����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ���
		//��֪ʶ�㣺������������ۺ�Ӧ�ã� [������]
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		    // ��λ
			int first = num%10;
			// ʮλ
			int sec = num/10%10;
			// ��λ
			int thrid = num/100%10;
			// ǧλ
			int forth = num/1000;
			System.out.println(first+sec+thrid+forth);*/
		// ���������ͱ���x���ж�x�Ƿ�Ϊż������Ϊż����
		// ���ڿ���̨�ϴ�ӡ���������ֵ��ż������
        /*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int x = num;
		if(x%2 == 0)
		{	
	        System.out.println("�������ֵ��ż��"+x);
		}else{
			System.out.println("�������ֵ������"+x);
		}*/
		// ���������ͱ���x��y�����ڿ���̨�����x��y��ֵ�ϴ���Ǹ�����
		/*Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
        int x = num1;
		int y = num2;
		if(x>y){
			System.out.println("x�ϴ�"+x);
		}else{
			System.out.println("y�ϴ�"+y);
		}*/
		// ����1+2+3+��+100�ĺͣ���ʾ����while��䣩
		/*int i = 1;
		int sum = 0;
		while(i<=100){
			sum += i;
         	i++;	
		}
		System.out.println(sum);*/
        // �����1��100������������ӣ���ʾ����while��䣩
		/*int i = 1;
		int sum = 0;
		while(i<=100){
			if(i%2==0){
			sum+=i;
			}i++;
		}
		System.out.println(sum);*/
        // ��do while ѭ������д1�ӵ�100
		/*int i = 1;
		int sum = 0;
		do{
			sum+=i++;
		}while(i<=100);
		System.out.println(sum);*/
		// ��forѭ������д1�ӵ�100
		/*int sum = 0;
		for(int i=1;i<=100;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);*/
		// ��forѭ����д��1��100������������ӵĺ�
		/*int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				continue;
			}else{
				sum =sum +i;
			}
		}
			System.out.println(sum);*/
		//��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ��
		// �������10%���������10��Ԫ�����ڻ����20��Ԫʱ��
		// ����10��Ԫ�Ĳ��֣������7.5%������20��
		// ���ڻ����40��ʱ������20��Ԫ�Ĳ��֣������5%��
		// ����40�򣬵��ڻ����60��ʱ������40��Ԫ�Ĳ��֣�
		// �����3%������60�򣬵��ڻ����100��ʱ������60��Ԫ�Ĳ��֣�
		// �����1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
		// �ڳ������趨һ������Ϊ����������Ӧ���Ž���������
		//��֪ʶ�㣺������䣩 [������]
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
		// ����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
		// A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��֪ʶ�㣺�������switch�� [������]
		/*Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		if(a>100 || a<0){
			System.out.println("��������");
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
        // ����ĳԱ���������н��30000Ԫ����н����������6%��
		// ��дһ��JavaӦ�ó�������Ա��10������н��
		// ��ͳ��δ��10�꣨�ӽ������������롣��֪ʶ�㣺ѭ�����for��[ѡ����]
		/*int sum = 0;
		for(int i=0;i<=10;i++){
		    sum += 30000+(30000*6/100);
		}
		System.out.println(sum);*/
		// ���ӵ�һ��ժ�����ɸ�����,��������һ��,����񫣬�ֶ����һ��,
		// �ڶ��������ֽ�ʣ�µ����ӳԵ�һ��,�ֶ����һ��.
		// �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��..
		// ����10���������ٳ�ʱ,��ֻʣ��һ��������.���һ�칲ժ�˶���.(֪ʶ��:ѭ��)
		/*int num = 1;
		for(int i=10;i>1;i--){
			num = (num+1)*2;
		}
		System.out.println(num);*/
		// ����һ�����֣��ж���һ����������ż��(֪ʶ�㣺�������)[������]	
	    /*Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
		if(num%2 == 0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}*/
		// ��д���� �ж�һ������x��ֵ�������1�����x=1��
		// �����5�����x=5������� 10�����x=10��
	    // �������ϼ���ֵ�������x=none����֪ʶ�㣺������䣩 [������]
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
		// �ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6��������
		// ��ֻ�ܱ�5��������ӡ�ܱ�5����������ֻ�ܱ�6����������ӡ�ܱ�6��������
		// ���ܱ�5��6����������ӡ���ܱ�5��6��������֪ʶ�㣺������䣩 [������]
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num%5==0 && num%6==0){
			System.out.println("�ܱ�5��6����");
		}else if(num%5==0 || num%6==0){
			System.out.println("ֻ�ܱ�5������ֻ�ܱ�6����");
		}else{
			System.out.println("���ܱ�5��6����");
		}*/
		// ����һ����ݣ��ж��������Ƿ�������
		//��֪ʶ�㣺������ѭ����䣩 [������]
	    /*Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
   		if(year%4==0 && year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��ƽ��");
		}*/
		// ����һ��0��100�ķ������������0��100֮�䣬
		// ��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E
		//��֪ʶ�㣺�������if elseif�� [������]
		/*Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score>100 && score<0){
			System.out.println("������Ч");
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
		// ������������x,y,z��
		// �������������С���������֪ʶ�㣺������䣩 [������]
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