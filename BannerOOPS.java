import java.util.HashMap;
import java.util.Map;

public class BannerOOPS {

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        printBanner("OOPS", map);
    }

    public static void printBanner(String text, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char c : text.toCharArray()) {

                String[] pattern = map.get(c);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}