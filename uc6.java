/**
 * OOPSBannerApp UC6 - Static Functions
 * Refactors the code to use modular helper methods for character patterns.
 * * @author Developer
 * @version 6.0
 */
public class UC6 {

    public static void main(String[] args) {
        // Use an array to store the 7 lines of the banner
        // We call our static methods directly inside the array initialization
        String[] banner = {
            getRow(0), getRow(1), getRow(2), getRow(3), getRow(4), getRow(5), getRow(6)
        };

        // Enhanced for-loop to print the final result
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Helper method to assemble a single row of the banner by joining letters.
     */
    public static String getRow(int row) {
        return String.join("  ", getO(row), getO(row), getP(row), getS(row));
    }

    // Static method for letter O pattern
    public static String getO(int row) {
        String[] o = {" OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "};
        return o[row];
    }

    // Static method for letter P pattern
    public static String getP(int row) {
        String[] p = {"PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "};
        return p[row];
    }

    // Static method for letter S pattern
    public static String getS(int row) {
        String[] s = {" SSSS", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "};
        return s[row];
    }
}git 