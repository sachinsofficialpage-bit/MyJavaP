public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];

        // Line 1
        lines[0] = String.join(" ",
                "*********",
                "*********",
                "*********",
                "*********");

        // Line 2
        lines[1] = String.join(" ",
                "*       *",
                "*       *",
                "*       *",
                "*        ");

        // Line 3
        lines[2] = String.join(" ",
                "*       *",
                "*       *",
                "*       *",
                "*        ");

        // Line 4
        lines[3] = String.join(" ",
                "*       *",
                "*       *",
                "*********",
                "*********");

        // Line 5
        lines[4] = String.join(" ",
                "*       *",
                "*       *",
                "*        ",
                "        *");

        // Line 6
        lines[5] = String.join(" ",
                "*       *",
                "*       *",
                "*        ",
                "        *");

        // Line 7
        lines[6] = String.join(" ",
                "*********",
                "*********",
                "*        ",
                "*********");

        // Print using enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
