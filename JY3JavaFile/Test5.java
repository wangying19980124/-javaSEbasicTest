

public class Test5{
    public static void main(String[] args){
        int x = 2;
		int y = f(x);
		System.out.print(y);
	}
	public static int f(int x){
	    //int y = x * x - 2 * x + 4;
		//int y = x % 3;
		int y = x++;
		return y;
	}
}