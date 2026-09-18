import java.io.IOException;
import java.io.PushbackReader;

public class Lexer {

    private final PushbackReader reader;

    public Lexer(PushbackReader reader) {
        this.reader = reader;
    }

    public Token nextToken() {
        return new Token(TokenKind.CONST, "CONST", 1);
    }

    public char advance() {
        return '\0';
    }

    public char peek() {
        return '\0';
    }

    public char peekNext() {
        return '\0';
    }

    public boolean match(char expected) {
        return false;
    }

    public String string() {
        return "";
    }

    public double number() {
        return 0;
    }

    public String identifier() {
        return "";
    }

    public boolean isAtEnd() throws IOException {
        int ch = this.reader.read();
        if (ch == -1) {
            return true;
        }
        this.reader.unread(ch);
        return false;
    }

    public PushbackReader getReader() {
        return reader;
    }
}
