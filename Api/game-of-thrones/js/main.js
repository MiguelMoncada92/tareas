var url = "https://anapioficeandfire.com/api/houses";

function nombreCasa(a) {
    $.get(url + "/" + a + "/", function(respuesta) {
        var innerHTML = "";
        if (a == 16) {
            innerHTML += "<h3>Casa:</h3> <h4>" + respuesta.name + "</h4>"
            innerHTML += "<h3>Region: </h3><h4>" + respuesta.region + "</h4>"
            innerHTML += "<h3>Titulos: </h3><h4>" + respuesta.titles + "</h4>"
        } else {
            innerHTML += "<h3>Casa:</h3> <h4>" + respuesta.name + "</h4>"
            innerHTML += "<h3>Region: </h3><h4>" + respuesta.region + "</h4>"
            innerHTML += "<h3>Palabras: </h3><h4>" + respuesta.words + "</h4>"
            innerHTML += "<h3>Titulos: </h3><h4>" + respuesta.titles + "</h4>"
        }
        $(".descripcion").html(innerHTML);
    }, "json");
};

function dejarEnBlanco() {
    $(".descripcion").html("<h4> Mueve el mouse sobre las imágenes </h4>");
};
$(document).ready(function() {
    $(".descripcion").hide();
    $(".descripcion").fadeIn(1000);
    dejarEnBlanco();
    $("img").hover(function() {
            var numeroCasa = $(this).attr("info-src");
            nombreCasa(numeroCasa);
        },
        function() {
            dejarEnBlanco();
        });
});