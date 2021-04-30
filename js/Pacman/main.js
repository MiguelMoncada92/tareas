/*lista de cosas que poner
1) hacer que js muestre el mundo brick/coin/etc
2) hacer que pacman se mueva arriba y abajo */


var world = [
    [2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2],
    [2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2],
    [2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2],
    [2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2],
    [2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2],
    [2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2],
    [2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2],
    [2, 1, 1, 2, 1, 1, 2, 1, 2, 3, 1, 1, 1, 1, 2],
    [2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2],
    [2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
];

var score = 0;

var pacman = {
    x: 1,
    y: 1
};

function displayWorld() {
    var output = "";
    for (var i = 0; i < world.length; i++) {
        output += "<div class='row'>";
        for (var j = 0; j < world[i].length; j++) {
            if (world[i][j] == 2) {
                output += "<div class='brick'></div>";
            } else if (world[i][j] == 1) {
                output += "<div class='coin'></div>";
            } else if (world[i][j] == 0) {
                output += "<div class='empty'></div>";
            } else if (world[i][j] == 3) {
                output += "<div class='cherry'></div>";
            }
        }
        output += "</div>";
    }
    document.getElementById("world").innerHTML = output;
}

function displayPacman() {
    document.getElementById("pacman").style.top = pacman.y * 20 + "px";
    document.getElementById("pacman").style.left = pacman.x * 20 + "px";
}

function displayScore() {
    document.getElementById("score").innerHTML = score;
}

document.onkeydown = function(e) {
    if (e.code == "ArrowUp" && world[pacman.y - 1][pacman.x] != 2) {
        pacman.y--;
    } else if (e.code == "ArrowDown" && world[pacman.y + 1][pacman.x] != 2) {
        pacman.y++;
    } else if (e.code == "ArrowLeft" && world[pacman.y][pacman.x - 1] != 2) {
        pacman.x--;
    } else if (e.code == "ArrowRight" && world[pacman.y][pacman.x + 1] != 2) {
        pacman.x++;
    }
    if (world[pacman.y][pacman.x] == 1) {
        world[pacman.y][pacman.x] = 0;
        score = score + 10;
        displayScore();
        displayWorld();
    } else if (world[pacman.y][pacman.x] == 3) {
        world[pacman.y][pacman.x] = 0;
        score = score + 1000;
        displayScore();
        displayWorld();
    }
    //console.log(e.code);
    displayPacman();
}