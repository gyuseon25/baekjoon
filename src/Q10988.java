import java.io.*;
import java.util.StringTokenizer;
public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1,num2;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        System.out.println(num1*num2);
    }
}
