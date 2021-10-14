package pokepo

fun batalha(jogador1: String, jogador2: String)=
    if (jogador1 == "charmander"){
        if (jogador2 == "squirtle")
            "squirtle"
        else "charmander"
    }

    else if (jogador1 == "bulbassauro"){
        if (jogador2 == "charmander")
            "charmander"
        else "bulbassauro"
    }

    else if (jogador1 == "squirtle"){
        if (jogador2 == "bulbassauro")
            "bulbassauro"
        else "squirtle"
    }
    else
        " "