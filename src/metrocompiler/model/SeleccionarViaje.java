package metrocompiler.model;

public class SeleccionarViaje extends Instruccion {
  private final String tipoViaje;

  public SeleccionarViaje(String tipoViaje) {
    this.tipoViaje = tipoViaje;
  }

  public String getTipoViaje() {
    return tipoViaje;
  }

  @Override
  public String describir() {
    return "SELECCIONAR VIAJE " + tipoViaje;
  }
}
