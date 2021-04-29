//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n) {
    let sum, i;
    sum = 0;
    for (i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
//devuelve la suma del primer y último número en el array
function sumFirstLast(arr) {
    let sum;
    sum = (arr[0] + arr[arr.length - 1]);
    return sum;
}

describe("Sum1toN", function() {
    it("should return 3 when we pass 2 as an argument", function() {
        expect(Sum1toN(2)).toEqual(3);
    });
    it("should return 6 when we pass 3 as an argument", function() {
        expect(Sum1toN(3)).toEqual(6);
    });
    it("should return 10 when we pass 4 as an argument", function() {
        expect(Sum1toN(4)).toEqual(10);
    });
});

describe("sumFirstLast", function() {
    it("should return 3 when we pass [1,2] as an argument", function() {
        expect(sumFirstLast([1, 2])).toEqual(3);
    });
    it("should return 10 when we pass [2,3,8] as an argument", function() {
        expect(sumFirstLast([2, 3, 8])).toEqual(10);
    });
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() {
        expect(sumFirstLast([-6, 23, 3, -4])).toEqual(-10);
    });
});

/*Ya sea en el mismo archivo o en uno diferente, 
crea una prueba o función que devuelva la suma del número más grande y el más pequeño del array. 
Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12. 
Una vez que hayas escrito la prueba, ejecútala 
(sin escribir toda la función para asegurarte de que fallen todas las pruebas), 
luego completa la función cerciorándote de que pase todas las pruebas. */
function sumaMaxMin(arr) {
    let sum, max, min;
    min = Math.min(...arr);
    max = Math.max(...arr);
    sum = max + min;
    return sum;
}

describe("sumaMaxMin", function() {
    it("should return 11 when we pass [1,3,10] as an argument", function() {
        expect(sumaMaxMin([1, 3, 10])).toEqual(11);
    });
    it("should return -12 when we pass [-2,-5,-10] as an argument", function() {
        expect(sumaMaxMin([-2, -5, -10])).toEqual(-12);
    });
});