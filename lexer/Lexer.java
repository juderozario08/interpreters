package lexer;

import java.io.BufferedReader;

public class Lexer {
    private BufferedReader reader;

    Lexer(BufferedReader reader) {
    }

    public char nextToken() {
        return '\0';
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

    public boolean isAtEnd() {
        return false;
    }

    public BufferedReader getReader() {
        return reader;
    }
}
