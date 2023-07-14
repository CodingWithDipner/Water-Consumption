import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		
		for(int i=1;i<=T;i++){
		    int X=sc.nextInt();
		    if(X>=2000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
}
