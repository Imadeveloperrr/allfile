import java.util.*;

public class pgm_hash_bestAlbum {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            HashMap<String, Integer> gen = new HashMap<>();
            HashMap<String, List<int[]>> pla = new HashMap<>();
            
            for (int i=0; i<genres.length; i++) {
                gen.put(genres[i], gen.getOrDefault(genres[i], 0) + plays[i]);   
                
                if(!pla.containsKey(genres[i]))
                    pla.put(genres[i], new ArrayList<>());
                pla.get(genres[i]).add(new int[]{i, plays[i]});
            }
            
            List<Map.Entry<String, Integer>> genList = new ArrayList<>(gen.entrySet());
            genList.sort((a, b) -> b.getValue() - a.getValue());
            
            for (String genre : pla.keySet()) {
                List<int []> songList = pla.get(genre);
                songList.sort((a, b) -> {
                    if (b[1] == a[1])
                        return a[0] - b[0];
                    return b[1] - a[1];
                });
            }
            
            List<Integer> bestAlbum = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : genList) {
                String genre = entry.getKey();
                List<int[]> songList = pla.get(genre);
                
                for (int i=0; i<Math.min(2, songList.size()); i++)
                    bestAlbum.add(songList.get(i)[0]);
            }
            
            return bestAlbum.stream().mapToInt(i -> i).toArray();
        }
    }
}
