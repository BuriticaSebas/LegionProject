# 🪖 Proyecto LEGION2

## 📌 Propósito Principal
LEGION2 es un simulador de campo de batalla que permite:

- 🏗️ Crear diferentes tipos de tropas militares  
- 🔢 Ordenarlas usando algoritmos de ordenamiento  
- 🗺️ Colocarlas en un campo de batalla de tamaño configurable  
- 👀 Visualizar el resultado final  

---

## 🏛️ Arquitectura y Patrones de Diseño Utilizados

### 🔒 1. Patrón Singleton
- **ReceiveArguments** → Maneja los argumentos de línea de comandos  
- **MapWithArguments** → Almacena los parámetros globalmente  

### 🏭 2. Patrón Factory
- **TroopsFactory** → Crea instancias de diferentes tipos de tropas  
- **TroopsEnum** → Enum que define los tipos de tropas disponibles  

### 🎯 3. Patrón Strategy
- **EstrategyAlgoritm** → Interfaz para algoritmos de ordenamiento  
- **Implementaciones** → *BubbleSort, InsertionSort, SelectionSort*  
- **ContextAlgorithm** → Contexto que usa la estrategia seleccionada  

### 🧱 4. Patrón Builder
- **BuildTroops** → Construye las listas de tropas  
- **BuildBattleField** → Construye y maneja el campo de batalla  

---

## ⚔️ Tipos de Tropas Disponibles

| Tipo          | Símbolo | Rango |
|---------------|---------|-------|
| Comandante    | C       | 10    |
| Médico        | M       | 20    |
| Tanque        | T       | 30    |
| Francotirador | S       | 40    |
| Infantería    | I       | 50    |

---

## ⚙️ Parámetros de Entrada

El programa acepta argumentos de línea de comandos:

- `a` → Algoritmo de ordenamiento (`i=InsertionSort`)  
- `t` → Tipo de datos (`n=números`, `c=caracteres`)  
- `f` → Tamaño del campo de batalla  
- `u` → Cantidad de unidades por tipo *(formato: comandante,médicos,tanques,francotiradores,infantería)*  
- `o` → Orientación del campo de batalla  

---

## 🔄 Flujo de Ejecución

1. Recibe y valida argumentos de línea de comandos  
2. Crea las tropas según los parámetros especificados  
3. Aplica algoritmo de ordenamiento si se indica  
4. Genera un campo de batalla de tamaño configurable  
5. Coloca las tropas aleatoriamente en el campo  
6. Imprime el resultado final  

---

## 🛠️ Características Técnicas

- **Genéricos** → Las tropas pueden usar `Integer` o `Character` como tipo de rango  
- **Validación** → Sistema robusto de validación de parámetros  
- **Flexibilidad** → Múltiples algoritmos de ordenamiento intercambiables  
- **Visualización** → Campo de batalla representado como **matriz 2D**  

---

## 🚀 Ejemplo de Uso

```bash
java -jar legion2.jar -a i -t n -f 10 -u 1,2,3,4,5 -o h

