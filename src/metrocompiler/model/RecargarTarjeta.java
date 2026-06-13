package metrocompiler.model;

import java.math.BigDecimal;

public class RecargarTarjeta extends Instruccion {
  private final String codigoTarjeta;
  private final BigDecimal montoRecargar;

  public RecargarTarjeta(String codigoTarjeta, BigDecimal montoRecargar) {
    this.codigoTarjeta = codigoTarjeta;
    this.montoRecargar = montoRecargar;
  }

  public String getCodigoTarjeta() {
    return codigoTarjeta;
  }

  public BigDecimal getMontoRecargar() {
    return montoRecargar;
  }

  @Override
  public String describir() {
    return "RECARGAR TARJETA PREPAGO " + codigoTarjeta + ", " + montoRecargar;
  }
}
