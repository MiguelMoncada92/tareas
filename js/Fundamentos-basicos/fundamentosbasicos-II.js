/*Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].*/
function cambiarPositivos(a) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] > 0) {
            a[i] = "big";
        }
    }
    return a;
}
console.log(cambiarPositivos());

/*Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor. */
function mayorMenor(a) {
    var min = a[0];
    var max = a[0];
    for (var i = 0; i < a.length; i++) {
        if (a[i] < min) {
            min = a[i];
        }
        if (a[i] > max) {
            max = a[i];
        }
    }
    console.log(min);
    return max;
}
x = mayorMenor();
/*Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números.
La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.*/
var arr = [1, 2, 3, 5];
console.log(imprimeRetorna(arr));

function imprimeRetorna(x) {
    console.log(x[x.length - 2]);
    for (var i = 0; i < x.length; i++) {
        if (x[i] % 2 === 0) {
            return x[i];
        }
    }
}
/*Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique. 
Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original. */
var arr = [1, 2, 3];
console.log(dobleVision(arr));

function dobleVision(x) {
    var newarr = [];
    for (var i = 0; i < x.length; i++) {
        newarr.push((x[i] * x[i]));
    }
    return newarr;
}
/*Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número
de valores positivos encontrados en el array. 
Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].*/
var arr = [-1, 1, 1, 1];
console.log(contarPositivos(arr));

function contarPositivos(x) {
    var contarpositivos = [];
    for (var i = 0; i < x.length; i++) {
        if (x[i] >= 0) {
            contarpositivos.push(1);
        }
    }
    x[x.length - 1] = contarpositivos.length;
    return x;
}
/*Pares e Impares - Crea una función que acepte un array. 
Cada vez que ese array tenga 3 valores impares seguidos, imprime (print) “¡Qué imparcial!”,
y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.*/
var arr = [];
paresImpares(arr);

function paresImpares(x) {
    for (var i = 0; i < x.length; i++) {
        if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 0) {
            console.log("¡Es para bien!");
        }
        if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
            console.log("¡Qué imparcial!");
        }
    }
}
/*Incrementa los Segundos - Dado un array de números arr, agrega 1 a cualquier otro elemento, 
específicamente a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc). 
Luego, console.log cada valor del array y devuelve arr. */
var arr = [1, 1, 3, 3, 5];
var a = incrementarSegundos(arr);
console.log(a);

function incrementarSegundos(x) {
    for (var i = 0; i < x.length; i++) {
        if (i % 2 != 0) {
            x[i] = x[i] + 1;
        }
        console.log(x[i]);
    }

    return x;
}
/*Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings,
reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior.
Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [“programar”,9, 4]. 
Pista: ¿For loops solo puede ir hacia adelante?*/
var arr = ["programar", "dojo", "genial"];
var a = longitudesPrevias(arr);
console.log(a);

function longitudesPrevias(x) {
    for (var i = x.length - 1; i >= 0; i--) {
        if ((i - 1) >= 0) {
            x[i] = x[(i - 1)].length;
        }
    }
    return x;
}

/*Agrega Siete - Construye una función que acepte un array. 
Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno. 
No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array. */
var arr = [1, 2, 3];
var a = agregaSiete(arr);
console.log(a);

function agregaSiete(x) {
    var newarr = [];
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i] + 7;
        newarr.push(x[i]);
    }
    return newarr;
}

/*Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. 
Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3].
Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).*/
function invertirArreglo(x) {
    for (var i = 0; i < x.length / 2; i++) {
        var temp = x[x.length - 1 - i];
        x[x.length - 1 - i] = x[i];
        x[i] = temp;
    }
    return x;
}
console.log(invertirArreglo([3, 1, 6, 4, 2]));
/*Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, 
pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].*/
function pesrspectivaNegativa(x) {
    for (var i = 0; i < x.length; i++) {
        x[i] = Math.abs(x[i]) * -1;
    }
    return x;
}
console.log(pesrspectivaNegativa([1, -3, 5]));
/*Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy”
 cada vez que alguno de los valores sea “comida”. Si ningún valor es “comida”,
  entonces imprime “tengo hambre” una vez. */
function hambriento(x) {
    for (var i = 0; i < x.length; i++) {
        if (x[i] == "comida") {
            console.log("yummy");
        }
    }
}
hambriento(["comida", "lasmd", "comida", "dojo"]);
/*Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc.
Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”]) cambia el array a [“pizza¨, 42, “Ada”, 2, true].
cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez. */
function cambiarHaciaElCentro(x) {
    for (var i = 0; i < x.length / 2; i++) {
        var temp = x[x.length - 1 - i];
        x[x.length - 1 - i] = x[i];
        x[i] = temp;
    }
    return x;
}
console.log(cambiarHaciaElCentro(["true", 42, "Ada", 2, "pizza"]));
/*Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr 
por el número num, y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].*/
function multiplicadoPor(x, y) {
    for (var i = 0; i < x.length; i++) {
        x[i] = x[i] * y;
    }
    return x;
}
console.log(multiplicadoPor([1, 2, 3], 3));