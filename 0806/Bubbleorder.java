import java.util.*;

public class Bubbleorder{
    public static void main(String[] args){
	    int[] nums = {23,10,-56,44,392};
		int[] newArr = bubbleOrder(nums);
		System.out.print(Arrays.toString(newArr));
	}
	// �������
	// ����Ϊ�����һ������
	// ���δ� ����ֵ���� ������(�����б�){
	// ������
	// }
	public static int[] bubbleOrder(int[] arr){
	    for(int i=0;i<arr.length-1;++i){
            for(int j=0;j<arr.length-1-i;j++){
                // �Ƚ�	
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
		return arr;
	}
	
}		
			
                			
	