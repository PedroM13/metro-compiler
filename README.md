# metro-compiler

Compilador en **JavaCC** para un lenguaje de estaciones de pago de metro/aerómetro.

## Estructura

```text
metro-compiler/
├── MetroCompiler.jj
├── README.md
├── SUPOSICIONES.md
├── testProgram.txt
├── src/
│   └── metrocompiler/
│       ├── Compilador.java
│       └── model/
│           ├── Token.java
│           ├── Instruccion.java
│           ├── SeleccionarViaje.java
│           ├── PagarViaje.java
│           ├── Devolver.java
│           ├── RecargarTarjeta.java
│           └── DescontarViaje.java
└── bin/
```

## Requisitos

- Java 11+
- JavaCC 7+

## Instalación y ejecución

1. Generar parser desde el archivo `.jj`:

```bash
javacc -OUTPUT_DIRECTORY=src MetroCompiler.jj
```

2. Compilar clases Java:

```bash
mkdir -p bin
javac -d bin $(find src -name "*.java")
```

3. Ejecutar compilador con el programa de prueba:

```bash
java -cp bin metrocompiler.Compilador testProgram.txt
```

## Instrucciones soportadas

- `SELECCIONAR VIAJE simple|doble|turistico`
- `PAGAR VIAJE monto_pagar, monto_pagado`
- `DEVOLVER`
- `RECARGAR TARJETA PREPAGO codigo_tarjeta, monto_recargar`
- `DESCONTAR VIAJE codigo_tarjeta, monto_descontar`

Todas las instrucciones finalizan con `;`.
