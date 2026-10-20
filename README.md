# COLAS - Implementación de Cola Dinámica en Java

Este repositorio contiene la implementación de una **Cola Dinámica** (estructura FIFO - *First In, First Out*) genérica en Java.

## 📁 Estructura del Proyecto

- `ColaDinamica.java`: Implementación de la cola genérica con operaciones fundamentales:
  - `enqueue(T elemento)`: Agrega un elemento al final de la cola.
  - `dequeue()`: Elimina y devuelve el elemento del frente de la cola.
  - `primero()`: Retorna el primer elemento sin extraerlo.
  - `isEmpty()`: Verifica si la cola está vacía.
  - `size()`: Retorna la cantidad de elementos en la cola.
  - `toString()`: Representación en texto de los elementos de la cola.
- `Nodo.java`: Clase que representa cada nodo enlazado de la cola (`elemento` y referencia al `siguiente`).
- `Main.java`: Clase de prueba con ejemplos prácticos de uso de la cola dinámica.

## 🚀 Compilación y Ejecución

Para compilar y ejecutar el proyecto desde la terminal:

```bash
# Compilar las clases
javac -d . *.java

# Ejecutar el programa principal
java ejercicio_ed_2_discoduroderoer.Main
```
