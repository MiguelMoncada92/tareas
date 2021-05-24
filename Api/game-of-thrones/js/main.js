var url = "https://anapioficeandfire.com/api/houses?page=2&pageSize=200";

$(document).ready(function() {
    $.get(url, function(respuesta) {
        console.log(url);
    }, "json")
});