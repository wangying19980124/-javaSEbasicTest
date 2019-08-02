public class Test2{
    public static void main(String[] args){
	    System.out.println(getSum(4,2)); 
		System.out.println(getSub(5,1)); 
		System.out.println(getMul(6,8)); 
		System.out.println(getDiv(12,6)); 
	}
	public static int getSum(int num1,int num2){
	    int result = num1+num2;
		return result;
    }
	public static int getSub(int num3,int num4){	
		int subtract = num3-num4;
		return subtract;
	}
	public static int getMul(int num5,int num6){
		int multiply = num5*num6;
		return multiply;
	}
	public static int getDiv(int num7,int num8){
		int division = num7/num8;
		return division;
	}
	
}