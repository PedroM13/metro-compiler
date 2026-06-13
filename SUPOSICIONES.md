# Suposiciones del compilador Metro/Aerometro

1. Los montos son decimales positivos, por ejemplo: `15.50`, `100.00`.
2. Los códigos de tarjeta son alfanuméricos con máximo 20 caracteres, por ejemplo: `TARJ001`, `ABC123`.
3. Cada instrucción termina con punto y coma (`;`).
4. Se permiten múltiples instrucciones en secuencia.
5. Las palabras clave NO distinguen mayúsculas/minúsculas.
6. El vuelto se calcula como: `monto_pagado - monto_pagar`.
7. Se permiten espacios en blanco y saltos de línea.
8. Los comentarios iniciados con `//` se ignoran.
9. Los números aceptan hasta 2 decimales.
10. `DEVOLVER;` requiere un `PAGAR VIAJE` válido previo.
