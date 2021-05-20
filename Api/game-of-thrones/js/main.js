var url = "https://anapioficeandfire.com/api/houses?page=1&pageSize=200";
$(document).ready(function() {
    $.get(url, function(respuesta) {
        console.log(respuesta);
    }, "json")
});