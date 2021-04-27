function fibonacci(a) {
    var fib1 = 1;
    var fib2 = 1;
    var posicion = 1;
    var num = parseInt(document.getElementById("numero").value);

    while (num > fib1 && num > fib2) {
        if (fib1 < fib2) {
            fib1 += fib2;
        } else {
            fib2 += fib1;
        }
        posicion++;
    }
    if (num == fib1 || num == fib2) {
        alert("el numero " + num + " pertenece a la sucesion y se encuentra en la posición " + (posicion + 1))
    } else {
        alert("en numero " + num + " no pertenece a la sucesion Fibonacci")
    }
}