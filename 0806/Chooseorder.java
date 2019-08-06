import java.util.*;

public class Chooseorder{
    public static void main(String[] args){
	    int [] nums = {-1,999,100,76,88};
		// 控制趟数
		for(int i=0;i<nums.length-1;i++){
		    // 控制每一趟的次数
		    for(int j=i+1;j<nums.length;j++){
		       // 进行比较
			   if(nums[i] > nums[j]){
			       //交换两个数
				   int temp = nums[i];
				   nums[i] = nums[j];
				   nums[j] = temp;
				   }
				}
		    }
			System.out.print(Arrays.toString(nums));
		}
}