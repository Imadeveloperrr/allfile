import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2581 { // 소수 찾기 코드
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(reader.readLine());
        int last = Integer.parseInt(reader.readLine());

        int min=last;
        int result=0;

        for (int i=start; i<last+1; i++) {
            if (isPrime(i)) {
                if (min > i)
                    min = i;
                result += i;
            }
        }
        if (result != 0)
            System.out.printf("%d\n%d", result, min);
        else
            System.out.print("-1");
        
    }

    // 제곱근으로 소수를 찾기
    public static boolean isPrime(int n) {
        if (n<2) return false;
        if (n==2) return true;
        if (n%2 == 0) return false;

        for (int i=3; i * i <= n; i+=2) 
            if (n%i == 0) return false;
            
        return true;
    }
}
