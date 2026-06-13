package metrocompiler.model;

import java.math.BigDecimal;

public class DescontarViaje extends Instruccion {
  private final String codigoTarjeta;
  private final BigDecimal montoDescontar;

  public DescontarViaje(String codigoTarjeta, BigDecimal montoDescontar) {
    this.codigoTarjeta = codigoTarjeta;
    this.montoDescontar = montoDescontar;
  }

  public String getCodigoTarjeta() {
    return codigoTarjeta;
  }

  public BigDecimal getMontoDescontar() {
    return montoDescontar;
  }

  @Override
  public String describir() {
    return "DESCONTAR VIAJE " + codigoTarjeta + ", " + montoDescontar;
  }
}
