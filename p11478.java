import java.io.*;
import java.util.*;

public class p11478 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String st = reader.readLine();
        HashSet<String> set = new HashSet<>();

        int stl = st.length();

        for (int i=0; i<stl; i++) {
            StringBuilder stb = new StringBuilder();
            for (int j=i; j<stl; j++) {
                stb.append(st.charAt(j));
                set.add(stb.toString());
            }
        }
        System.out.print(set.size());
    }
}