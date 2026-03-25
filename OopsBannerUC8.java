import java.util.HashMap;
import java.util.Map;
public class OopsBannerUC8 {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            " *** ", 
            "** **", 
            "** **", 
            "** **", 
            " *** "
        });
        patternMap.put('P', new String[]{
            "**** ", 
            "** **", 
            "**** ", 
            "** ", 
            "** "
        });
        patternMap.put('S', new String[]{
            " **** ", 
            "** ", 
            " *** ", 
            "    **", 
            "**** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        int rows = 5;

        System.out.println("--- OOPS Banner (UC8: HashMap & Scalable Architecture) ---\n");

        for (int i = 0; i < rows; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    rowBuilder.append(pattern[i]).append("  ");
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }
}