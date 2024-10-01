import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class p11650 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        List<int[]> points = new ArrayList<>();

        for (int i=0; i<N; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            points.add(new int[]{x,y});
        }

        Collections.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0])
                return Integer.compare(p1[1], p2[1]);
            return Integer.compare(p1[0], p2[0]);
        });

        for (int[] point : points)
            System.out.println(point[0] + " " + point[1]);
    }
}