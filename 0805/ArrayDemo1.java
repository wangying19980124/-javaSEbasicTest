import java.util.*;

public class ArrayDemo1{
    public static void main(String[] args){
		// 统计字符串“统计一个字符在字符串中的所有位置”中字符 '字'出现的所有位置
        /*String s = "统计一个字符在字符串中的所有位置";
		char k = '字';
		System.out.println(Arrays.toString(count(s,k)));
	}
	public static int[] count(String str,char key){
		int[] count = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c==key){
				//扩展数组
				count = Arrays.copyOf(count,count.length+1);
				//添加序号
				count[count.length-1]=i;
			}
		}
		return count;*/
		
		// 统计字符数组 char[ ] chs =
		// {'统'，'计'，'一'，'个'，'字'，'符'，'在'，'字'，'符'，'串'，'中'}
		// 中字符 ’字‘出现的位置
		/*char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
		for(int i=0;i<chs.length;i++){
			if(chs[i] == '字'){
				System.out.println("字符在字符数组中的位置:" +i);
			}
		}*/
		
		//字符串："123456789012" 
		//将字符串的奇数位数字相加为 c1 = 1 + 3 + 5 + 7 + 9 + 1 
		//将字符串的偶数位数字相加为 c2 = 2 + 4 + 6 + 8 + 0 + 2
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
	    System.out.println("奇数和为:"+oldNum);
		System.out.println("偶数和为:"+evenNum);*/
		
		// 将一个整数（56123）翻转（32165）
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	