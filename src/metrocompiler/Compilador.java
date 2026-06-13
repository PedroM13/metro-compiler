package metrocompiler;

import java.io.FileInputStream;
import java.io.InputStream;
import metrocompiler.model.Instruccion;
import metrocompiler.parser.MetroCompiler;
import metrocompiler.parser.ParseException;

public class Compilador {
  public static void main(String[] args) {
    String archivo = args.length > 0 ? args[0] : "testProgram.txt";

    try (InputStream in = new FileInputStream(archivo)) {
      MetroCompiler parser = new MetroCompiler(in);
      parser.Programa();

      System.out.println("Compilación exitosa.");
      for (Instruccion instruccion : parser.getInstrucciones()) {
        System.out.println("- " + instruccion.describir());
      }
    } catch (ParseException e) {
      System.err.println("Error de compilación: " + e.getMessage());
      System.exit(1);
    } catch (Exception e) {
      System.err.println("Error inesperado: " + e.getMessage());
      System.exit(1);
    }
  }
}
