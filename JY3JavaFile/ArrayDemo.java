import java.util.*;

public class ArrayDemo{
    public static void main(String[] args){
	    // ������������ byte short int long float double char boolean
		// ���� Class interface
		// ������������������������ַ���  ������ص�:�����ġ����ȹ̶���������ȷ���±��0��ʼ
		// ��һ�ִ�������ķ�ʽ
	    // int[] array = int{1,3,6,2,9};
		// �ڶ��ִ�������ķ�ʽ
		/*int[] num = new int[5];
		num[0]=1;
		num[1]=30;*/
		// �����ִ�������ķ�ʽ ָ�����ȣ���̬��ʼ��2��û��ָ�����ȣ���̬��ʼ��1��3
		/*int[] nums = new int[]{
		    1,2,3,4,5
		}*/
		// System.out.print(array[2]);
		// array.length���� array.length()����
        /*for(int i=0;i<array.length;i++){
              System.out.print(array[i]);		
	    }*/
		// System.out.print(array[5]);//�����������Ϊ���±����Ϊ4
		// System.out.print(num[1]);
		// System.out.print(nums[2]);
		
		// ����ı���   ������������ null��
		/*byte[] bytes = {1,3,5,7,9};
		byte[] byte2 = bytes;
		System.out.print(bytes[0]);
		System.out.print(byte2[0]);
		bytes[0] = 100;
		System.out.print(bytes[0]);
		System.out.print(byte2[0]);*/
		
		/*int[] src = {1,2,3,5};
		int[] dest = new int[4];
		System.arraycopy(src,0,dest,0,src.length);
		System.out.println(Arrays.toString(dest));*/

        /*byte[] sourceArray = {1,2,3,4,5,6};
        byte[] newArray= Arrays.copyOf(sourceArray);
        System.out.print(Arrays.toString(newArray));*/	


        //��������
		//Դ����
		byte[] sourceArray = {1,2,3,4,5};
        byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length);
        newArray[newArray.length-1] = 100;
        System.out.print(Arrays.toString(newArray));		





















		
    }		
}