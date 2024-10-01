import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p2231 {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 받은 자연수 N
        int N = Integer.parseInt(br.readLine());
        
        // 가장 작은 생성자를 찾기 위한 변수 초기화
        int result = 0;
        
        // 1부터 N-1까지 모든 수를 탐색하여 생성자 여부 확인
        for (int i = 1; i < N; i++) {
            int sum = i;  // 현재 숫자 i
            int temp = i;
            
            // 각 자리수 더하기
            while (temp > 0) {
                sum += temp % 10;  // 마지막 자리수 더하기
                temp /= 10;        // 마지막 자리수 제거
            }
            
            // 분해합이 N과 같으면 생성자 발견
            if (sum == N) {
                result = i;
                break;  // 가장 작은 생성자를 찾았으므로 중단
            }
        }
        
        // 결과 출력 (생성자가 없는 경우는 0 출력)
        System.out.println(result);
    }
}
