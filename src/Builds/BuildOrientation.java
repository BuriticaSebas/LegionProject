package Builds;

public class BuildOrientation {

    public static void Norte(String[][] array){

        //tenemos que recorre la lista e ir añadiendovalores ordenadamente
        //en el norte la lista se recorre hacia arriba de izquiera a derecha
        // y la validacion de los tipos se hace hacia la derecha

        int filaInicial  = array.length - 1; // abajo
        int columnaInicial = 0;             // primera columna
    }

    public static void Sur(String[][] array){

        //en el sur la lista se recorre hacia abajo de izquierda a derecha
        // y la validacion de los tipos se hace hacia la derecha
        int filaInicial  = 0;               // arriba
        int columnaInicial = 0;             // primera columna
    }

    public static void Este(String[][] array){

        //en el este la lista se recorre hacia la derecha igual
        // y la validacion se hace hacia arriba es decir si estoy en
        // 0 [*,M,T,I]
        // 1 [*,M,T,I]
        // 2 [C,M,T,I]
        // comienzo en 2 y valido los indices iguales del array de arriba

        int filaInicial  = 0;               // primera fila
        int columnaInicial = 0;             // izquierda
    }


    public static void Oeste(String[][] array){

        //en el oeste la lista comienza en la parte baja derecha y
        // y se recorre hacia la izquierda
        //las validaciones se hacen hacia arriba
        // es decir en la parte
        // [I,S,*,*,*]
        // [I,S,*,*,*]
        // [I,S,T,*,*]
        // [I,S,T,M,*]
        // [I,S,T,M,C]
        int filaInicial  = 0;               // primera fila
        int columnaInicial = array[0].length - 1; // derecha
    }
}