public class Test7{
    public static void main(String[] args){
	    int x = 5,y = 6,z = 0;
	    z = ++x + y++;
		x = ++x + x++;
		z = x>y ? ++x : y++;
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
	}
}