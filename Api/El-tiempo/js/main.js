var claveApi = "4acb794f20f3eb51e75ed22589b3bf52";
var url = "http://api.openweathermap.org/data/2.5/weather?q=";

function obtenerCoordenadas(a) {
    $.get(url + a + "&APPID=" + claveApi + "&lang=es ", function(res) {
        var coordenadas = "";
        coordenadas += "<h5>Coordenadas</h5>";
        coordenadas += "<ul>";
        coordenadas += "<li>longitud: " + res.coord.lon + "</li>";
        coordenadas += "<li>latitud: " + res.coord.lat + "</li>";
        coordenadas += "<ul>";
        $(".coordenadas").html(coordenadas);
    }, 'json');
};

function temperaturaCelsius(a) {
    $.get(url + a + "&units=metric" + "&APPID=" + claveApi, function(res) {
        var temperatura = "";
        temperatura += "<h5>Temperatura</h5>";
        temperatura += "<ul>";
        temperatura += "<li>temperatura: " + (res.main.temp) + " °C</li>";
        temperatura += "<ul>";
        $(".temperatura").html(temperatura);
    }, 'json');
};

function obtenerCondicionesCielo(a) {
    $.get(url + a + "&APPID=" + claveApi + "&lang=sp ", function(res) {
        var cielo = "";
        cielo += "<h5>Cielo</h5>";
        cielo += "<ul>";
        cielo += "<li>" + (res.weather[0].main) + "</li>";
        cielo += "<li>" + (res.weather[0].description) + "</li>";
        cielo += "<ul>";
        $(".ciudad").html(cielo);
    }, 'json');
};


$(document).ready(function() {
    $('form').submit(function() {
        var nombreCiudad = $("input").first().val();
        temperaturaCelsius(nombreCiudad);
        obtenerCoordenadas(nombreCiudad);
        obtenerCondicionesCielo(nombreCiudad);
        return false;
    });
});