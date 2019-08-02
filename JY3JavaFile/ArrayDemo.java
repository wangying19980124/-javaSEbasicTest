import java.util.*;

public class ArrayDemo{
    public static void main(String[] args){
	    // 基本数据类型 byte short int long float double char boolean
		// 数组 Class interface
		// 创建数组的三引用数据类型种方法  数组的特点:连续的、长度固定、类型明确、下标从0开始
		// 第一种创建数组的方式
	    // int[] array = int{1,3,6,2,9};
		// 第二种创建数组的方式
		/*int[] num = new int[5];
		num[0]=1;
		num[1]=30;*/
		// 第三种创建数组的方式 指定长度，动态初始化2，没有指定长度，静态初始化1，3
		/*int[] nums = new int[]{
		    1,2,3,4,5
		}*/
		// System.out.print(array[2]);
		// array.length属性 array.length()方法
        /*for(int i=0;i<array.length;i++){
              System.out.print(array[i]);		
	    }*/
		// System.out.print(array[5]);//不能输出，因为右下标最大为4
		// System.out.print(num[1]);
		// System.out.print(nums[2]);
		
		// 数组的遍历   引用数据类型 null空
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


        //扩容数组
		//源数组
		byte[] sourceArray = {1,2,3,4,5};
        byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length);
        newArray[newArray.length-1] = 100;
        System.out.print(Arrays.toString(newArray));		





















		
    }		
}