package metrocompiler.model;

import java.math.BigDecimal;

public class PagarViaje extends Instruccion {
  private final BigDecimal montoPagar;
  private final BigDecimal montoPagado;

  public PagarViaje(BigDecimal montoPagar, BigDecimal montoPagado) {
    this.montoPagar = montoPagar;
    this.montoPagado = montoPagado;
  }

  public BigDecimal getMontoPagar() {
    return montoPagar;
  }

  public BigDecimal getMontoPagado() {
    return montoPagado;
  }

  @Override
  public String describir() {
    return "PAGAR VIAJE " + montoPagar + ", " + montoPagado;
  }
}
