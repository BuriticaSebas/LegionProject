March of the Legion
• Desarrollo de un simulador de tropas tipo RTS (Real Time Strategy) en Java 
que aplique los principios de la 
Programación Orientada a Objetos ɢ
POOɣ para la creación de unidades 
militares y utilice algoritmos de 
ordenamiento para organizarlas en un 
campo de batalla.
March of the Legion
Objetivos:
General • Desarrollar un programa en Java que utilice los pilares de la POO para modelar diferentes 
tipos de tropas y algoritmos de ordenamiento para organizarlas en un campo de batalla..
Específicos: • Implementar clases y herencia para modelar diferentes tipos de unidades, como 
Infantería, Sniper, Tanques, Médicos, Ingenieros, Artilleros y Comandantes. • Aplicar polimorfismo y encapsulación para gestionar las acciones y atributos de cada tipo 
de tropa. • Utilizar estructuras de datos como matrices y listas para representar el campo de batalla. • Implementar al menos cuatro algoritmos de ordenamiento para organizar las tropas en 
función de atributos de rango. • Manejar excepciones y validar entradas para garantizar la robustez del programa.
March of the Legion
Descripción del Problema
Crear un simulador de tropas militares que 
pueda organizar eficientemente unidades en un campo de batalla N x N (o configurable), 
mostrando cómo se ordenan según 
diferentes atributos utilizando varios 
algoritmos de ordenamiento. El programa 
debe permitir también la colocación aleatoria 
de tropas y gestionar adecuadamente 
excepciones y validaciones.
March of the Legion
Marco Teórico
Programación Orientada a Objetos ɢPOOɣ : • Clases para las unidades militares. • Herencia para las subcategorías (Ej. Sniper hereda de Character). • Polimorfismo en acciones (Ej. move() or sort()). • Encapsulamiento de atributos (vida, velocidad, fuerza, rango).
Estructuras de Datos: • Listas para la colección de tropas. • Matriz (N x N) para el campo de batalla. • Maps para validación de parámetros
March of the Legion
Marco Teórico
Algoritmos de Ordenamiento: • Implementación de al menos cuatro (Bubble Sort, Merge Sort, Insertion Sort, Quick Sort). • Ordenamiento por atributos de fuerza.
Validaciones y Excepciones: • Asegurar un manejo adecuado de errores y situaciones inesperadas. • Control de argumentos.
March of the Legion
Requisitos del Proyecto
 Modelado de tropas con clases e interfaces.
 Implementación de ordenamientos por atributos personalizables.
 Visualización del campo de batalla.
 Parámetros CLI para entrada del usuario.
 Cronometrar el tiempo de ejecución del ordenamiento.
 Código documentado + diagrama UML.
 Git con historial de cambios.
March of the Legion
Aspectos Clave del Proyecto a ser evaluados:
1. Implementación POOɘ
• Creación de Tipos de Tropas: Clases como Infantería, Tanque, Sniper, Médico, 
Ingeniero, Artillero y Unidad Antiaérea
• Herencia y Polimorfismo: Jerarquía de clases base (Character or Troop) y clases hijas con comportamiento distinto (por ejemplo, daño o velocidad). • Encapsulamiento y Abstracción: Atributos privados y métodos públicos de 
acceso/modificación.
2. Algoritmos de Ordenamiento: • Implementar al menos cuatro algoritmos (ej: Burbuja, Inserción, Selección, MergeSort). • Visualizar cómo se reorganizan las tropas.
March of the Legion
Aspectos Clave del Proyecto a ser evaluados:
3. Parametrización y Configuración: • Selección del algoritmo a usar mediante parámetro a=. • Selección del tipo de lista de entrada: t=n para lista de números (prioridad) o t=c para caracteres (tipos) este atributo solo se utilizará para la evaluación de mitad 
de modulo. • Permitir ordenar las tropas en el campo de batalla según su posición geográfica 
relativa, utilizando el parámetro o. • Número de unidades a desplegar: r=1,2,4,7,8.
4. Interfaz de Usuario y Visualización: • Interfaz tipo CLI (línea de comandos) o futura integración con UI gráfica. • Muestra visual del campo de batalla una al principio y al final del ordenamiento.
March of the Legion
Aspectos Clave del Proyecto a ser evaluados:
5. Validación y Control de Errores: • Validar posiciones válidas en el campo. • Validar que las tropas no excedan el campo de batalla. • Manejar errores de entrada del usuario. • Validar que las diferentes unidades no se mezclen.
6. Desarrollo Iterativo y Evaluación: • Avance semanal revisado por un tutor, con énfasis en la implementación 
progresiva de características. • Evaluaciones parciales para asegurar el cumplimiento de los objetivos y 
requisitos del proyecto.
March of the Legion
æŶ₃ѳƌ ъЧ↓AĮ > æᵸAAEl programa se ejecuta mediante una línea de comando CLI con parámetros.
java Troops a=q t=n o=s r=1,1,4,7,10 f=10
Significado Argumentos:
Parámetro Algorithm a: Es el algoritmo de ordenamiento a utilizar
a => (string)
• “S” o “s” -> Selection sort (selección)
• “B” o “b” -> Bubble sort (burbuja)
• “I” o “i” -> Insertion sort (inserción)
• “M” o “m” -> Merge sort (combinación)
• “Q” o “q” -> Quick sort (rápida)
• “H” o “h” -> Heap sort (montón)
• “C” o “c” -> Counting sort (conteo)
• “R” o “r” -> Radix sort (raíz)
March of the Legion
Significado Argumentos:
Parámetro Type t: 
Se debe parametrizar el tipo de lista (numérica o de caracteres) donde los números o 
caracteres ingresados determinan el tipo de unidad (entrega en evaluación parcial) para 
la entrega final este debería ser el atributo de rango:
 “C” o “c”-> Lista de caracteres
a → j Comandante, 
k → t Médico, 
u → z continua con A ʿ J Tanque, 
K ʿ N Sniper, 
O ʿ X Infantería,
t => (string) Tipo de lista
“N” o “n”-> Lista de números
 n>0 y n<11 Comandante, 
n>10 y n<21 Médico, 
n>20 y n<31 Tanque, 
n>30 y n<41 Sniper, 
n>40 y n<51 Infantería,
March of the Legion
Significado Argumentos:
Parámetro Orientation o: Se debe permitir ordenar las tropas en el campo de batalla según 
su posición geográfica relativa, utilizando el parámetro o:
o=> (string) Tipo de ordenamiento
“N” o “n” → Ordenar de sur a norte
“S” o “s” → Ordenar de norte a sur
“E” o “e” → Ordenar de oeste a este
“W” o “w” → Ordenar de este a oeste
March of the Legion
Significado Argumentos:
Parámetro Units u – Distribución de Tropas por Rol: El parámetro u debe ser un arreglo de enteros 
que representa la cantidad de tropas por tipo, organizadas jerárquicamente según su rol en el 
campo de batalla. La posición del índice en el arreglo indica el tipo de tropa, y el valor numérico en 
esa posición representa cuántas unidades de ese tipo se desplegarán.
Ejemplo de estructura del arreglo:
u=>1,2,5,4,10 (array) Tropas en el campo de batalla
Significa:
u[0] = 1 → 1 Comandante
u[1] = 2 → 2 Médicos
u[2] = 5 → 5 Tanques
u[3] = 4 → 4 Snipers
u[4] = 10 → 10 Unidades de Infantería
March of the Legion
Significado Argumentos:
Parámetro f – Tamaño del Campo de Batalla: El parámetro f define las dimensiones del 
campo de batalla, representado como una matriz cuadrada de NxN casillas.
Donde:
N es un número entero positivo mayor o igual a 5 y menor o igual a 1000 (por defecto, se 
usa 10 si no se especifica).
Por ejemplo, un f=10 Esto crea un campo de batalla de 10x10 casillas.
March of the Legion
Generación Aleatoria de Tropas en el Campo de Batalla
La posición inicial de las tropas será generada aleatoriamente, el programa debe ejecutar 
las siguientes acciones: • Selección Aleatoria de Tropas:
Se seleccionarán aleatoriamente unidades del conjunto disponible de tipos de tropas 
(por ejemplo: comandante, médico, infantería, y otros elementos relacionados, según 
lo definido en el proyecto), hasta alcanzar las cantidades indicadas por el parámetro r. 
Esta selección debe hacerse mediante un generador de números aleatorios.
March of the Legion
Generación Aleatoria de Tropas en el Campo de Batalla
• Restricción por tamaño del campo de batalla:
a) Puede haber múltiples soldados de infantería, médicos o comandantes, pero limitados según las dimensiones del campo (f) y el número de tropas (r).
b) No se debe exceder la cantidad total de casillas disponibles (f x f) sabiendo que 
cada tipo de unidad tiene que estar en una línea distinta. • Ubicación Aleatoria en el Campo:
Cada tropa debe ser colocada en una posición aleatoria dentro del campo de batalla, 
representado por una matriz cuadrada de tamaño f x f. • Evitar Conflictos de Posición:
El sistema debe validar que no haya dos tropas ocupando la misma casilla. En caso de 
conflicto, se deberá intentar con una nueva posición aleatoria.
March of the Legion
Generación Aleatoria de Tropas en el Campo de Batalla
• Restricción por tamaño del campo de batalla:
a) Puede haber múltiples soldados de infantería, médicos o comandantes, pero limitados según las dimensiones del campo (f) y el número de tropas (r).
b) No se debe exceder la cantidad total de casillas disponibles (f x f) sabiendo que 
cada tipo de unidad tiene que estar en una línea distinta. • Ubicación Aleatoria en el Campo:
Cada tropa debe ser colocada en una posición aleatoria dentro del campo de batalla, 
representado por una matriz cuadrada de tamaño f x f. • Evitar Conflictos de Posición:
El sistema debe validar que no haya dos tropas ocupando la misma casilla. En caso de 
conflicto, se deberá intentar con una nueva posición aleatoria. • Representación Interna del Campo:
Se debe crear una estructura interna del campo de batalla en el programa (una matriz, lista o mapa), donde se registren las tropas y sus posiciones.
March of the Legion
Generación Aleatoria de Tropas en el Campo de Batalla
• Visualización Inicial:
El campo inicial con las tropas posicionadas aleatoriamente debe mostrarse al usuario 
a través de la interfaz de línea de comandos o, en caso de extensión, mediante una 
interfaz gráfica. • Diseño Orientado a Objetos ɢOOPɣ :
Toda la solución debe implementarse aplicando los principios de la Programación 
Orientada a Objetos, incluyendo herencia, polimorfismo, encapsulación y abstracción 
para modelar las tropas y el campo de batalla. • Documentación y Métricas:
Se requiere incluir el diagrama de clases UML, documentación del código y mostrar al 
usuario el tiempo total transcurrido para ordenar las tropas según el algoritmo elegido.
March of the Legion
Ejemplo 1:
Input:
java Troops a=i t=c o=s u=1,2,5,5,10 f=10
Output:
Algorithm: [Insertion sort]
Type: [Character]
Orientation: [Sud]
Troops: [23]
Battlefield: [10 x 10]
March of the Legion
Initial Position:
* * S * * T * * * I
I * * * * * * S * *
* * * I * * * * M *
* T * * * * I I * *
* * * * c * * * * I
I * S * * * S * T *
* * S * * T * * * *
* * * I * * * * I *
* M * * * I * * * *
S * * * * * * * T *
Leyenda:
Cɘ Comandante
Mɘ Médico
Tɘ Tanque
Sɘ Sniper
Iɘ Infantería
*: Posición vacía
March of the Legion
Final Position:
c * * * * * * * * *
M M * * * * * * * *
T T T T T * * * * *
S S S S S * * * * *
I I I I I I I I I I 
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
March of the Legion
Ejemplo 2:
Input:
java Troops a=q t=c o=n u=1,2,5,5,10 f=10
Output:
Algorithm: [Quick sort]
Type: [Character] 
Orientation: [North] 
Troops: [23] 
Battlefield: [10 x 10]
March of the Legion
Initial Position:
* * S * * T * * * S
I * * * * I * S * *
* * * T * * * * M *
* T * * * * I I * *
* * * * C * * * * I
I * * * * * S * T *
* * * * * * * * * *
* * * I * * * S I *
* M * * S I * * * *
* * * * * * * * T I
March of the Legion
Final Position:
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
I I I I I I I I I I 
S S S S S * * * * *
T T T T T * * * * *
M M * * * * * * * *
c * * * * * * * * *
March of the Legion
Ejemplo 3:
Input:
java Troops a=R t=c o=e u=1,2,5,5,10 f=6
Output:
Algorithm: [Radix]
Type: [Character] 
Orientation: [East] 
Troops: [23] 
Battlefield: [6 x 6]
March of the Legion
Initial Position:
S I S I T *
I I * S * I
* T M T * M
T * I I * I
* S C * * I
I * S * T *
March of the Legion
Final Position:
* * * * I *
* * T S I *
* * T S I I
* * T S I I
* M T S I I
C M T S I I
March of the Legion
Ejemplo 4 (error de tamaño):
Input:
java Troops a=c t=c o=e u=1,2,5,5,13 f=6
Output: 
Algorithm: [Counting sort]
Type: [Character]
Orientation: [East] 
Troops: [26] 
Battlefield: [6 x 6] 
Error: “invalid battlefield size”
March of the Legion
Explicación: debería retornar error ya que el campo de batalla está lleno y como dice las 
restricciones cada tipo diferente de unidad tiene que estar separado y en este caso solo 
entrarían 12 unidades de infantería no hay lugar para colocar 13 unidades de infantería ya 
que se mezclarían con los snipers.
* * * * I I
* * T S I I
* * T S I I -> solo entra 12 unidades de infantería
* * T S I I
* M T S I I
C M T S I I
March of the Legion
Ejemplo 5:
Input:
java Troops a=r t=c o=w u=1,1,2,3,5 f=6
Output:
Algorithm: [Radix] 
Type: [Character]
Orientation: [west] 
Troops: [12] 
Battlefield: [6 x 6]
March of the Legion
Initial Position:
S * S * T *
* I * * * I
* T M * * *
* * * I * *
* S C * * I
I * * * * *
March of the Legion
Final Position:
* * * * * *
* I * * * *
* I * * * *
* I S * * *
* I S T * *
* I S T M C
March of the Legion
Ejemplo 6 (error de argumentos):
Input:
java Troops a=c t=c o=ajs u=1,2,5,5,13 f=6
Output: 
Algorithm: [Counting sort] 
Type: [Character]
Orientation: [invalid] 
Troops: [26] 
Battlefield: [6 x 6]
Error: “Value of Orientation is invalid”
