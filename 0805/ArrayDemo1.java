import java.util.*;

public class ArrayDemo1{
    public static void main(String[] args){
		// ͳ���ַ�����ͳ��һ���ַ����ַ����е�����λ�á����ַ� '��'���ֵ�����λ��
        /*String s = "ͳ��һ���ַ����ַ����е�����λ��";
		char k = '��';
		System.out.println(Arrays.toString(count(s,k)));
	}
	public static int[] count(String str,char key){
		int[] count = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c==key){
				//��չ����
				count = Arrays.copyOf(count,count.length+1);
				//������
				count[count.length-1]=i;
			}
		}
		return count;*/
		
		// ͳ���ַ����� char[ ] chs =
		// {'ͳ'��'��'��'һ'��'��'��'��'��'��'��'��'��'��'��'��'��'��'��'��'}
		// ���ַ� ���֡����ֵ�λ��
		/*char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		for(int i=0;i<chs.length;i++){
			if(chs[i] == '��'){
				System.out.println("�ַ����ַ������е�λ��:" +i);
			}
		}*/
		
		//�ַ�����"123456789012" 
		//���ַ���������λ�������Ϊ c1 = 1 + 3 + 5 + 7 + 9 + 1 
		//���ַ�����ż��λ�������Ϊ c2 = 2 + 4 + 6 + 8 + 0 + 2
		/*String str = "123456789012";
		int oldNum = 0;
		int evenNum = 0;
		for(int i=0;i<str.length();i++){
			if(i%2 == 0){
				oldNum += str.charAt(i)-'0';
		}else{
			    evenNum += str.charAt(i)-'0';
	        	}
		}
	    System.out.println("������Ϊ:"+oldNum);
		System.out.println("ż����Ϊ:"+evenNum);*/
		
		// ��һ��������56123����ת��32165��
		System.out.println(rev(56123));
	}
	public static int rev(int num){
		int val = 0;
		while(true){
			int last = num%10;
			val = val*10+last;
			num=num/10;
			if(num==0){
				break;
			}
		}
		return val;	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	