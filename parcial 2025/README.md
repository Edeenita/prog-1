> [!Note]
> En una plataforma educativa en línea, los estudiantes leen el material de estudio 
> que está dividido en secciones. 
> El sistema registra, en un  arreglo T de tamaño MAXT, 
> la cantidad de minutos que cada estudiante tarda en leer cada sección.
> Cada tiempo de lectura se representa mediante un número entero positivo.
>  El sistema de monitoreo agrupa los tiempos por estudiante: 
> para separar las lecturas de un estudiante de las de otro, 
> se insertan uno o más valores negativos entre las secuencias de tiempos. 
> Estos valores negativos no representan tiempos reales, 
> sino que funcionan únicamente como delimitadores de sesión. 
> También se insertan uno o más valores negativos al inicio y al final del arreglo T. 

>[!Tip]
> En el siguiente ejemplo, se muestra un arreglo T que contiene los tiempos de lectura de 4 estudiantes.
> El estudiante 1 leyó 5 secciones:   
> para la primera tardó 23 minutos, para la segunda, 21, y así sucesivamente.
```java
[-6 -8 23 21 20 19 15 -1 -15 14 13 16 -8 -10 30 28 22 16 12 -3 -56 52 54 60 -5]
```
>[!Note]
> Cada sección de lectura está pensada para que insuma tiempos similares al estudiante, 
> por lo tanto, si el tiempo de lectura que el estudiante dedica a cada sección disminuye gradualmente, 
> se considera una posible falta de concentración o interés en el tema. 
> Por esta razón, se pide:
> Implementar un programa en Java para determinar e informar qué estudiantes presentan este comportamiento (el tiempo de lectura de cada sección 
> disminuye gradualmente). 
> Además, se debe transformar el tiempo total invertido por el estudiante, en aquellos casos que no evidencien falta de 
> concentración o interés en el tema, al formato de horas y minutos, 
> reemplazando en el mismo arreglo los tiempos parciales de lectura de cada sección.

>[!IMPORTANT]
> Nota: Para convertir la suma total de minutos al formato horas y minutos, se debe dividir el total por 60 para obtener las horas y usar 
> el resto de esa división para los minutos. Por ejemplo, 75 minutos se convierten a 1 hora y 15 minutos.

>[!Tip]
> Para el ejemplo anterior, los alumnos que muestran una posible falta de concentración o interés en el tema son el 1 y el 3, y el arreglo 
> resultante luego de pasar los tiempos totales al formato hora y minutos sería:
```java
[-6 -8 23 21 20 19 15 -1 0 -58 -8 -10 30 28 22 16 12 -3 3 42 -5 -5 -5 -5 -5]
```
> [!WARNING]
> IMPORTANTE: asumir que el número mínimo de secciones que un alumno es 3. El ejemplo es meramente ilustrativo, la solución planteada debe ser
> válida para cualquier arreglo T. Aplicar TODAS las buenas prácticas vistas en la materia. No usar estructuras auxiliares.

