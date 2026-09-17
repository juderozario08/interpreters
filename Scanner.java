import java.io.*;
import java.util.*;

public class Scanner {

    enum TokenCategory {
        CONST,
        LET,
        ID,
        IF,
        FUNCTION,
        PLUS,
        MINUS,
        COMP,
        SC,
    }

    record Token(String value, TokenCategory category) {}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.cl"));
        String line;
        var tokenList = new ArrayList<Token>();
        boolean stringMode = false;
        while ((line = br.readLine()) != null) {
            line = line.strip();
            if (line.startsWith("//")) continue;
            String tokenValue = "";
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '"' && !stringMode) {
                    stringMode = true;
                }
                if (stringMode) {
                    tokenValue += line.charAt(i);
                }
                if (line.charAt(i) == '"' && stringMode) {
                    stringMode = false;
                }
            }
        }
        for (var tok : tokenList) {
            System.out.println(tok.value() + ": " + tok.category());
        }
        br.close();
    }
}
