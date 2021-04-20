/*Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255*/
function array() {
    var arr = [];
    for (var i = 1; i <= 255; i++) {
        arr.push(i);
    }
    return arr;
}
console.log(array());
/*Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio.  */
function pares() {
    var par = [];
    for (var i = 1; i <= 1000; i++) {
        if (i % 2 == 0) {
            par.push(i);
        }
    }
    return par;
}
console.log(pares());
/*Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).*/
function sumImpares() {
    var sum = 0;
    for (var i = 1; i <= 5000; i++) {
        sum = sum + i;
    }
    return sum;
}
console.log(sumImpares());
/*Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14). */
function sumArr(a) {
    var sum = 0;
    for (var i = 0; i < a.length; i++) {
        sum = sum + a[i];
    }
    return sum;
}
console.log(sumArr());
/*Encuentra el mayor (max): Dado un array con múltiples valores, escribe una función que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). */
function maxNumb(a) {
    var max = a[i];
    for (var i = 0; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
}
console.log(maxNumb());
/*Encuentra el promedio (avg): Dado un array con múltiples valores, escribe una función que devuelva el promedio de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).*/
console.log(average());

function average(a) {
    avg = 0;
    for (var i = 0; i < a.length; i++) {
        avg = avg + a[i];
    }
    return (avg / a.length);
}
/*Array de impares: Escribe una función que devuelva un array de todos los números impares entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.*/
console.log(impares());

function impares() {
    var imp = [];
    for (var i = 1; i <= 50; i++) {
        if (i % 2 !== 0) {
            imp.push(i);
        }
    }
    return imp;
}

/*Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). */
console.log(mayorqueY());

function mayorqueY(x, Y) {
    var newarr = [];
    for (var i = 0; i < x.length; i++) {
        if (x[i] > Y) {
            newarr.push(1);
        }
    }
    return newarr.length;
}
/*Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor (ej: [1,5,10,-2] será [1,25,100,4]).*/
console.log(valorCuadrado());

function valorCuadrado(a) {
    for (var i = 0; i < a.length; i++) {
        a[i] = a[i] * a[i];
    }
    return a;
}

/*Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0. Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).*/
console.log(sinNegativos());

function sinNegativos(a) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] < 0) {
            a[i] = 0;
        }
    }
    return a;
}
/*Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max), menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).*/
console.log(maxMinAvg());

function maxMinAvg(a) {
    var max = a[0];
    var min = a[0];
    var avg = 0;
    for (var i = 0; i < a.length; i++) {
        if (max < a[i]) {
            max = a[i];
        }
        if (min > a[i]) {
            min = a[i];
        }
        avg = avg + a[i];
    }
    var newarr = [max, min, (avg / a.length)]
    return newarr;
}
/*Intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array. La extensión mínima predeterminada del array es 2 (ej: [1,5,10,-2] será [-2,5,10,1]). */
console.log(intercambio());

function intercambio(a) {
    if (a.length < 2) {
        return "el arreglo debe tener 2 o más elementos"
    } else {
        var temp = a[a.length - 1];
        a[a.length - 1] = a[0];
        a[0] = temp;
    }
    return a;
}
/*De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’. Por ejemplo, dado el array = [-1,-3,2], tu función devolverá [‘Dojo’,‘Dojo’,2].*/
console.log(negativosDojo());

function negativosDojo(a) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] < 0) {
            a[i] = "Dojo";
        }
    }
    return a;
}