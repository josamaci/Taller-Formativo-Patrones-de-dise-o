# Taller Formativo - Patrones de diseño

## Integrantes

- José Macias
- Kevin Valle
- Nicolás Plaza

## Explicación

### Builder

El patrón builder nos ayuda a construir un vehículo paso a paso, también nos permite producir los distintos modelos de vehículos utilizando el mismo código de construcción.
Como lo que queremos son diferentes representaciones de ciertos vehículos utilizar el patrón builder nos facilita la tarea.

Así nos evitamos:

- crear un constructor enorme dentro de la clase Vehículo
- crear una subclase para cada configuración posible de Vehículo

### Decorator

Por otro lado el patrón decorator nos ayuda con los dispositivos adicionales de los vehículos. A un auto ya construido deberíamos poder cambiarle sus partes o aumentarles nuevas. Gracias a este patrón podemos agrergar funcinalidades adicionales a los autos durante el tiempo de ejecución sin descomponer el código.

Utilizando el patrón decorator nos evitamos:

- crear clases por cada combinación de dispositivos adicionales
