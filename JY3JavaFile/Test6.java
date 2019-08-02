public class Test6{
    public static void main(String[] args){
	    int allDates = 188;
		int pageSize = 10;
		int totalPage = 0;
		totalPage = allDates%pageSize == 0 ? allDates/pageSize : allDates/pageSize+1;
		System.out.print(totalPage);
	}
}	
		