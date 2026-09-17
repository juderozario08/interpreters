package lexer;

public class Token {
    public final TokenKind kind;
    public final String lexeme;
    public final int line;

    public Token(TokenKind kind, String lexeme, int line) {
        this.kind = kind;
        this.lexeme = lexeme;
        this.line = line;
    }
}
