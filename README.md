# Proyecto: Synchronized en Métodos Estáticos

## Descripción

Este proyecto demuestra el uso de métodos estáticos sincronizados en Java para gestionar la concurrencia entre hilos. Se basa en la sincronización de accesos a una variable compartida para evitar condiciones de carrera.

## Estructura del Proyecto

```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── hilos
│   │   │   │   ├── Main.java
│   │   │   │   ├── hilos
│   │   │   │   │   ├── Counter.java
│   │   │   │   │   ├── hilorunebol.java
│   │   │   │   │   ├── hilouno.java
└── target
    ├── classes
        ├── hilos
        │   ├── Main.class
        │   ├── hilos
        │   │   ├── Counter.class
        │   │   ├── hilorunebol.class
        │   │   ├── hilouno.class
```

## Archivos Clave

- **`pom.xml`**: Archivo de configuración de Maven.
- **`Main.java`**: Punto de entrada del programa.
- **`Counter.java`**: Contiene una variable compartida y métodos sincronizados.
- **`hilorunebol.java`**\*\* y \*\*\*\*`hilouno.java`\*\*: Implementaciones de hilos que interactúan con `Counter.java`.

## Instalación y Ejecución

### Prerrequisitos

- Tener instalado [Java JDK 8+] ([https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html))

## Explicación Técnica

- **Sincronización en Métodos Estáticos:** Se utiliza `synchronized` en métodos estáticos para garantizar que solo un hilo acceda al recurso compartido a la vez.
- **Ejemplo de Condición de Carrera Evitada:** La clase `Counter` maneja un contador incrementado por múltiples hilos, asegurando consistencia en los valores.

## Autor

Steveco12

##

