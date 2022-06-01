import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int sum=a*b*c;    
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
    int res=0;    
		while(true){
      res= sum%10;
      arr[res]+=1;
      sum=(sum/10);
      if(sum==0)
        break;
    }
    for(int i=0 ;i<10;i++)
        System.out.println(arr[i]);
		in.close();
	}
}