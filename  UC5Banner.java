public class UC5Banner {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "", "", "", "", "", "", "", "", "", ""),
            String.join("", "", " ", " ", " ", "WELCOME", " ", " ", " ", ""),
            String.join("", "", " ", " ", "TO", " ", "UC5", " ", " ", ""),
            String.join("", "", " ", "JAVA", " ", "BANNER", " ", " ", ""),
            String.join("", "", " ", " ", "DEMO", " ", " ", " ", ""),
            String.join("", "", " ", " ", " ", " ", " ", " ", " ", ""),
            String.join("", "", "", "", "", "", "", "", "", "", "")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}

