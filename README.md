Proyecto desarrollado en Java para la asignatura de Programación / Entornos de Desarrollo. Consiste en una aplicación de consola para la gestión de citas en un taller mecánico.

Este proyecto se ha realizado en equipo utilizando Git y GitHub para practicar el trabajo con ramas (features y bugfix), gestión de Pull Requests (PR) y resolución de conflictos de fusión.

Integrantes del Grupo y Reparto de Roles

  - Alumno A (Líder del proyecto): Ibon
      - Creación del repositorio base y estructura inicial del menú.   Rama feature/registro-cita: Gestión de la recogida de datos del cliente, vehículo y asignación de citas.
      - Rama feature/registro-cita: Gestión de la recogida de datos del cliente, vehículo y asignación de citas.

  - Alumno B (Desarrollador 1): Telmo
      - Rama feature/calculo-coste: Cálculo del importe según el tipo de servicio y aplicación de descuentos según la matrícula.
      - Resolución del conflicto de fusión en la rama principal.

  - Alumno C (Desarrollador 2): Unax
      - Rama feature/formato-fechas: Formateo y validación de las fechas en formato español (dd/MM/yyyy HH:mm).
      - Rama bugfix/limpieza-matricula: Corrección y limpieza de espacios en las matrículas.

Funcionalidades del programa:

  1. Registrar nueva cita: Pide los datos del cliente (nombre) y del vehículo (matrícula, marca, modelo), permite elegir un tipo de servicio (aceite, revisión, frenos, distribución) y valida la fecha/hora.
     
  2. Calcular coste de servicio: Calcula el precio final aplicando descuentos especiales según el tipo de matrícula:
     - 20% de descuento: Matrículas que terminan en ECO.
     - 15% de descuento: Matrículas históricas (empiezan por H).
     - 10% de descuento: Matrículas con serie promocional (contienen 00).

  3. Formateo de fechas: Muestra las fechas de las citas en el estándar de España mediante DateTimeFormatter.

Tecnologías Utilizadas

  - Lenguaje: Java
  - Entorno de desarrollo (IDE): IntelliJ IDEA
  - Control de versiones: Git y GitHub

Flujo de Trabajo en Git

  Para el desarrollo del proyecto se han seguido estas fases:
  
   1. Estructura e Issues: Creación del proyecto base y tareas en el tablero de GitHub Projects.
   2. Desarrollo en ramas: Cada integrante trabajó de forma aislada en su propia rama feature/.
   3. Pull Requests y Fusión: Se integraron los cambios en la rama main gestionando las aprobaciones de revisión.
   4. Resolución de conflictos: Se resolvió en equipo un conflicto de fusión en la rama main durante el PR de la funcionalidad del cálculo de costes.
   5. Hotfix y Tagging: Creación de una rama de corrección rápida para limpiar matrículas y etiquetado de la versión final con v1.0.

Nota de la versión

  - Versión actual: v1.0
