import java.util.*;

public class Chooseorder{
    public static void main(String[] args){
	    int [] nums = {-1,999,100,76,88};
		// ��������
		for(int i=0;i<nums.length-1;i++){
		    // ����ÿһ�˵Ĵ���
		    for(int j=i+1;j<nums.length;j++){
		       // ���бȽ�
			   if(nums[i] > nums[j]){
			       //����������
				   int temp = nums[i];
				   nums[i] = nums[j];
				   nums[j] = temp;
				   }
				}
		    }
			System.out.print(Arrays.toString(nums));
		}
}