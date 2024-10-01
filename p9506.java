import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p9506 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
        while (true) {
            int input = Integer.parseInt(reader.readLine());
            ArrayList<Integer> divisor = new ArrayList<>();

            if (input != -1) {
                int sum=0;
                for (int i=1; i<input+1; i++) {
                    if (input%i == 0) {
                        if(input != i) {
                            divisor.add(i);
                            sum += i;
                        }
                    }
                }

                if (input == sum) {
                    System.out.printf("%d = ", input);
                    for (int i=0; i<divisor.size(); i++) {
                        System.out.printf("%d ",divisor.get(i));
                        if (i < divisor.size()-1)
                            System.out.print("+ ");
                    }
                    System.out.println();
                }
                else {
                    System.out.printf("%d is NOT perfect.\n", input);
                }
            }
            else {
                break;
            }
        }
    }
}
