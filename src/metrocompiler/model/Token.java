package metrocompiler.model;

public class Token {
  private final String tipo;
  private final String lexema;

  public Token(String tipo, String lexema) {
    this.tipo = tipo;
    this.lexema = lexema;
  }

  public String getTipo() {
    return tipo;
  }

  public String getLexema() {
    return lexema;
  }

  @Override
  public String toString() {
    return "Token{" +
      "tipo='" + tipo + '\'' +
      ", lexema='" + lexema + '\'' +
      '}';
  }
}
