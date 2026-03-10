public class BannerApp {

    public static void main(String[] args) {

        String[] lines = {
                String.join("   ", O(0), O(0), P(0), S(0)),
                String.join("   ", O(1), O(1), P(1), S(1)),
                String.join("   ", O(2), O(2), P(2), S(2)),
                String.join("   ", O(3), O(3), P(3), S(3)),
                String.join("   ", O(4), O(4), P(4), S(4))
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Pattern for O
    public static String O(int row) {
        String[] pattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return pattern[row];
    }

    // Pattern for P
    public static String P(int row) {
        String[] pattern = {
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
        return pattern[row];
    }

    // Pattern for S
    public static String S(int row) {
        String[] pattern = {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
        return pattern[row];
    }
}