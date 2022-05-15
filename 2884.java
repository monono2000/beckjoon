import java.util.Scanner;

class 2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B;
    A=sc.nextInt();
    B=sc.nextInt();
    if (B-45<0){
      if (A==0){
        System.out.println("23 "+(60+(B-45)));
      }
      else
        System.out.println((A-1)+" "+(60+(B-45)));
    }
    else{
        System.out.println(A+" "+(B-45));
    }
    sc.close();
  }
}