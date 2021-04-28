var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];


function buscarPorNombre() {
    var nombre = document.getElementById("nombre").value;
    for (var i = 0; i < users.length; i++) {
        if (nombre == users[i].name) {
            return document.getElementById("edad").innerHTML = users[i].age;
        }
    }
    return document.getElementById("edad").innerHTML = "Este nombre no esta en la lista";
}







/*¿Cómo harías print/log de la edad de John?*/
console.log(users[1].edad);
/*¿Cómo harías print/log del nombre del primer objeto?*/
console.log(users[0].name);
/*¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? 
Tu output debería verse algo como esto
Michael - 37
John - 30
David - 27*/
var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];
var i = 0;
for (i = 0; i < users.length; i++) {
    console.log(users[i].name + " - " + users[i].age);
}

/*¿Cómo harías para imprimir el nombre de los mayores de edad?*/
for (i = 0; i < users.length; i++) {
    if (users[i].age > 18) {
        console.log(users[i].name);
    }
}