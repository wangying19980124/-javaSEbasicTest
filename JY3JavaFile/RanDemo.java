import java.util.Random;

public class RanDemo{
    public static void main(String[] args){
	    Random r = new Random();
		int rInt = r.nextInt(60);
		char result = (char)('A' + rInt);
		System.out.println(rInt);
	}
}