import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p25206 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grade[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        Double gradePoint[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        String input[] = new String[3];
        Double totalGrade=0.0;
        Double gpa=0.0;
        for(int i=0; i<20; i++) {
            input = reader.readLine().split(" ");
            Double one=0.0, two=0.0;
            for(int j=0; j<grade.length; j++) {
                if(grade[j].equals(input[2])) {
                    one=Double.parseDouble(input[1]);
                    two=gradePoint[j];
                    break;
                }
            }
            
            totalGrade += one;
            gpa += one * two;
        }
        System.out.printf("%.6f\n", gpa/totalGrade);
        reader.close();
    }
}