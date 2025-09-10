Proyecto LEGION2
Propósito Principal

Es un simulador de campo de batalla que permite:

Crear diferentes tipos de tropas militares

Ordenarlas usando algoritmos de ordenamiento

Colocarlas en un campo de batalla de tamaño configurable

Visualizar el resultado final

Arquitectura y Patrones de Diseño Utilizados
1. Patrón Singleton

ReceiveArguments: Maneja los argumentos de línea de comandos

MapWithArguments: Almacena los parámetros globalmente

2. Patrón Factory

TroopsFactory: Crea instancias de diferentes tipos de tropas

TroopsEnum: Enum que define los tipos de tropas disponibles

3. Patrón Strategy

EstrategyAlgoritm: Interfaz para algoritmos de ordenamiento

Implementaciones: BubbleSort, InsertionSort, SelectionSort

ContextAlgorithm: Contexto que usa la estrategia seleccionada

4. Patrón Builder

BuildTroops: Construye las listas de tropas

BuildBattleField: Construye y maneja el campo de batalla

Tipos de Tropas Disponibles

Comandante (C) - Rango: 10

Médico (M) - Rango: 20

Tanque (T) - Rango: 30

Francotirador (S) - Rango: 40

Infantería (I) - Rango: 50

Parámetros de Entrada

El programa acepta argumentos de línea de comandos:

a: Algoritmo de ordenamiento (i=InsertionSort)

t: Tipo de datos (n=números, c=caracteres)

f: Tamaño del campo de batalla

u: Cantidad de unidades por tipo (formato: comandante,médicos,tanques,francotiradores,infantería)

o: Orientación (para el campo de batalla)

Flujo de Ejecución

Recibe y valida argumentos de línea de comandos

Crea las tropas según los parámetros especificados

Aplica algoritmo de ordenamiento si se especifica

Genera un campo de batalla de tamaño configurable

Coloca las tropas aleatoriamente en el campo

Imprime el resultado final

Características Técnicas

Genéricos: Las tropas pueden usar Integer o Character como tipo de rango

Validación: Sistema robusto de validación de parámetros

Flexibilidad: Múltiples algoritmos de ordenamiento intercambiables

Visualización: Campo de batalla representado como matriz 2D
