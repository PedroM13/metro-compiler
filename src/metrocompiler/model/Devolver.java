package metrocompiler.model;

import java.math.BigDecimal;

public class Devolver extends Instruccion {
  private final BigDecimal vuelto;

  public Devolver(BigDecimal vuelto) {
    this.vuelto = vuelto;
  }

  public BigDecimal getVuelto() {
    return vuelto;
  }

  @Override
  public String describir() {
    return "DEVOLVER " + vuelto;
  }
}
