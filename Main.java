import java.io.FileReader;
import java.io.IOException;

public static void main(String[] args)
    throws IOException, InterruptedException {
    var reader = new PushbackReader(new FileReader("test.cl"));
    var lexer = new Lexer(reader);
    while (!lexer.isAtEnd()) {
        System.out.print((char) reader.read());
    }
    reader.close();
}
