import java.util.Scanner;
public class HomeWork1{
    public static void main(String[] args){ 
		// �ŵ�����:��һ������,�ӳ��������������ÿ���¶���һ������,
		// С���ӳ����������º�ÿ��������һ������,�������Ӷ�����,��ÿ���µ���������Ϊ����?
		System.out.println("��ÿ���µ���������Ϊ����?");
				Scanner scanner = new Scanner(System.in);
				int ri = scanner.nextInt();
				if(ri<=2) {
					System.out.println("������1������");
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