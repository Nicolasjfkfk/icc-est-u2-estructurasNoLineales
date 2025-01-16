# Estructuras No Lineales – Ejercicios con Árboles

## Descripción General
Este proyecto contiene la implementación de cuatro ejercicios relacionados con árboles binarios. Los ejercicios tienen como objetivo mejorar la comprensión de las estructuras de datos no lineales y su manipulación en Java.

### Ejercicio 1: Insertar en un Árbol Binario de Búsqueda (BST)
Implementa un algoritmo para insertar valores en un BST. El árbol sigue las reglas de un BST: los valores menores están a la izquierda, y los mayores, a la derecha.
- **Entrada:** [5, 3, 7, 2, 4, 6, 8]
- **Salida:**
  ```
      5
   3     7
  2 4   6 8
  ```

### Ejercicio 2: Invertir un Árbol Binario
Invierte un árbol binario dado, cambiando los subárboles izquierdo y derecho en todos los nodos.
- **Entrada:**
  ```
      4
   2     7
  1 3   6 9
  ```
- **Salida:**
  ```
      4
   7     2
  9 6   3 1
  ```

### Ejercicio 3: Listar Niveles en Listas Enlazadas
Devuelve una lista enlazada para cada nivel de un árbol binario.
- **Entrada:**
  ```
      4
   2     7
  1 3   6 9
  ```
- **Salida:**
  ```
  4
  2 -> 7
  1 -> 3 -> 6 -> 9
  ```

### Ejercicio 4: Calcular la Profundidad Máxima
Calcula la profundidad máxima de un árbol binario.
- **Entrada:**
  ```
      4
   2     7
  1 3     8
  ```
- **Salida:**
  Profundidad Máxima: 3  (en el pdf esta de 4 ahi no le entendi)

## Instrucciones de Ejecución
Compilar y ejecutar el archivo principal `App.java`. Descomenta el método correspondiente al ejercicio que deseas ejecutar:
   - `runEjercicio1()` para insertar en un BST.
   - `runEjercicio2()` para invertir un árbol binario.
   - `runEjercicio3()` para listar niveles.
   - `runEjercicio4()` para calcular la profundidad máxima.


## Conclusión
Este proyecto permite practicar conceptos fundamentales de árboles binarios, como inserción, recorrido, manipulación y análisis. A través de estos ejercicios, se mejora la comprensión de estructuras de datos no lineales y la implementación eficiente en Java.

