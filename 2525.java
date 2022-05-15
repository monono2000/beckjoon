import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, C;
    A=sc.nextInt();
    B=sc.nextInt();
    C=sc.nextInt();
    int D=0;
    if ((B+C)>=60){
      if ((A+((B+C)/60))>23){
        System.out.println((D+(24-(A+((B+C)/60))))+" "+((B+C)%60));
      }
      else
        System.out.println((A+(B+C)/60)+" "+((B+C)%60));
    }
    else{
        System.out.println(A+" "+(B+C));
    }
    sc.close();
  }
}