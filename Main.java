import lexer.*;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("test.cl"));
    String line;
    var tokenList = new ArrayList<Token>();
    while ((line = br.readLine()) != null) {
        line = line.strip();
    }
    for (var tok : tokenList) {
        System.out.println(tok.lexeme + ": " + tok.kind);
    }
    br.close();
}
