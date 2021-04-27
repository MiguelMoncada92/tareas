/*Sigma - Implementa una función sigma(num) que, dado un número, devuelve la suma de todos 
los enteros positivos (incluyendo el número dado). Ej: sigma(3) = 6 (1+2+3); sigma(5) = 15 (1+2+3+4+5).*/
function sigma(a) {
    var x = 0;
    for (var i = 0; i <= a; i++) {
        x = x + i;
    }
    return x;
}
console.log(sigma(3));
console.log(sigma(5));
console.log(sigma(10));
/*Factorial - Escribe una función factorial(num) que, dado un número, devuelva el producto (multiplicación) 
de todos los enteros positivos (incluyendo el número dado). 
Por ejemplo: factorial(3) = 6 (1*2*3); factorial(5) = 120 (1*2*3*4*5).*/
function factorial(a) {
    x = 1;
    for (var i = 1; i <= a; i++) {
        x = x * i;
    }
    return x;
}
console.log(factorial(3));
console.log(factorial(5));
console.log(factorial(10));
/*Fibonacci - Crea una función para generar números de Fibonacci.
En esta famosa secuencia matemática, cada número es la suma de las dos anteriores, partiendo con los valores 0 y 1. 
Tu función debería aceptar un argumento, un índice en la secuencia
(donde 0 corresponde al valor inicial, 4 corresponden al valor cuatro más tarde, etc). 
Ejemplos: fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado), fibonacci(2) = 1 (fib(0)+fib(1), o 0+1),
fibonacci(3) = 2 (fib(1) + fib(2)3, o 1+1), fibonacci(4) = 3 (1+2), fibonacci(5) = 5 (2+3), 
fibonacci(6) = 8 (3+5), fibonacci(7) = 13 (5+8). Haz esto primero sin usar recursión. 
Si no sabes qué es una recursión, no te preocupes puesto que vamos a 
introducir este concepto en la Parte 2 de esta actividad.*/
function fibonacci(a) {
    if (a < 2) {
        return a;
    } else {
        return (fibonacci(a - 1) + fibonacci(a - 2));
    }
}
console.log(fibonacci(0));
console.log(fibonacci(1));
console.log(fibonacci(2));
console.log(fibonacci(3));
console.log(fibonacci(4));
console.log(fibonacci(5));
console.log(fibonacci(6));
console.log(fibonacci(7));

/*Array: Penúltimo: Devuelve el penúltimo elemento del array. Dado [42,true,4,”Liam”, 7] devuelve “Liam”. 
Si el array es muy pequeño, devuelve null.  */
var array = [42, true, 4, "Liam", 7];

function penultimo(a) {
    if (a.length <= 1) {
        return null;
    } else {
        return a[a.length - 2];
    }
}
console.log(penultimo(array));

/*Array: “N” último: Devuelve el elemento “N” último. Dado ([5,2,3,6,4,9,7],3], devuelve 6. 
Si el array es muy pequeño, devuelve null. */

function devolverEnesimo(a, b) {
    if (a.length - 1 <= 1) {
        return null;
    } else {
        return a[b];
    }
}
console.log(devolverEnesimo([5, 2, 3, 6, 4, 9, 7], 3));
console.log(devolverEnesimo([1, 2], 3));

/*Array: Segundo más grande: Devuelve el segundo elemento más grande de un array. Dado [42,1,4,3.14,7], devuelve 7.
Si el array es muy pequeño, devuelve null.*/
function segundoMasGrande(a) {
    if (a.lenght < 1) {
        return null;
    } else {
        var x = a;
        var max = a[0];
        var max2 = null;
        for (var i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (var i = 0; i < a.length; i++) {
            if (a[i] < max) {
                max2 = a[i];
            }
        }
        return max2;
    }
}

console.log(segundoMasGrande([42, 1, 4, 3.14, 7]));
console.log(segundoMasGrande([]));

/*Doble Problema Par: Crea una función que cambie un array dado duplicando cada uno de sus elementos 
en una posición par, y manteniendo el orden original.
Convierte [4, "Ulysses", 42, false]   a    [4,4, "Ulysses", "Ulysses", 42, 42, false, false].*/
function dobleValor(a) {
    var newarr = [];
    for (var i = 0; i < a.length; i++) {
        newarr.push(a[i], a[i]);
    }
    return newarr;
}
console.log(dobleValor([4, "Ulysses", 42, "false"]));