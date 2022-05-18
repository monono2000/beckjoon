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
    StringTokenizer s;

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
       s = new StringTokenizer(br.readLine()," ");
      bw.write("Case #"+(i+1)+": "+((Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken())+ "\n")));

    }
    br.close();

    bw.flush();
    bw.close();

  }
}
