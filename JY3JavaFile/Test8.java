import java.util.Scanner;

public class Test8{
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		//System.out.println("请输入你的成绩：");
		//double score = scanner.nextDouble();
		//if(score > 100 || score < 0){
		//    System.out.println(" super man ");
		//}else if(score >= 90 && score <= 100){
		//    System.out.println("优秀");
		//}else if(score >=80 && score < 90){
		//    System.out.println("良好");
        //}else{
        //    System.out.println("不及格");
        //}
		
		/*int num = 0;
		while(num != -1){
			System.out.println("请输入一个数:");
			num = Scanner.nextInt();
			System.out.println("您输入的数为："+num);
		}*/
		/*int x1 = 1;
		int y1 = 1;
		int x2 = 0;
		int y2 = 1;
		double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.println(distance);*/
		
		
		double salary = scanner.nextDouble();
		double minStandrad = 5000;
		double finalSalary = salary - minStandrad;
	    double oneMoney = 1000;
		double subSidy = 500;
		double realSalary = 0;
		if(finalSalary<=1500){
			realSalary = finalSalary*0.97+minStandrad-oneMoney+subSidy;
        }else if(finalSalary>1500 && finalSalary<=4500){
		    realSalary = finalSalary*0.90+minStandrad-oneMoney+subSidy;
        }else if(finalSalary>4500 && finalSalary<=9000){
            realSalary = finalSalary*0.80+minStandrad-oneMoney+subSidy;	
        }else if(finalSalary>9000 && finalSalary<=35000){
            realSalary = finalSalary*0.75+minStandrad-oneMoney+subSidy;	
        }else if(finalSalary>35000 && finalSalary<=55000){
            realSalary = finalSalary*0.70+minStandrad-oneMoney+subSidy;		
        }else{
			realSalary = minStandrad-oneMoney+subSidy;
		}
		System.out.print(realSalary);
		
		/*String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		int threeNum = 0;
		int fourNum = 0;
		int fiveNum = 0;
		int sixNum = 0;
		for(int i=0;i<str.length();i++){
			if(i%2 == 0){
			    oldNum += str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
		}	
	}	
		threeNum = oldNum + 3*evenNum;
		fourNum = threeNum%10;
		fiveNum = 10 - fourNum;
		sixNum = fiveNum%10;
		System.out.print(sixNum);*/
		
		
		
		
	
		
		
    }
}	



























			