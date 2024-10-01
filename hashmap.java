import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    }

    public static boolean twosum(int[] num, int target) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int nums : num) {
            int total = target - nums;

            if (hashMap.containsKey(total)) {
                return true;
            }
            hashMap.put(total, true);

        }   

        return false;
    }

    public String hashText(String[] participant, String[] completion) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (String nums : participant) {
            hashMap.put(nums, true);
        }

        for (String nums : completion) {
            hashMap.remove(nums);
        }

        Map.Entry<String, Boolean> entry = hashMap.entrySet().iterator().next();

        return entry.getKey().toString();
    }
}
