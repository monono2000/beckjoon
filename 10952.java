import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while(true){
      String n = br.readLine();
      StringTokenizer num = new StringTokenizer(n);
      int a =Integer.parseInt(num.nextToken());
      int b = Integer.parseInt(num.nextToken());
      if (a==0 && b==0)
        break;
      bw.write((a+b)+"\n");
    }
  
    br.close();

    bw.flush();
    bw.close();

  }
}
