package pokepo

fun batalha(jogador1: String, jogador2: String): String {
    if (jogador1 == "charmander"){
        if (jogador2 == "squirtle")
            return "squirtle"
        return "charmander"
    }

    if (jogador1 == "bulbassauro"){
        if (jogador2 == "charmander")
            return "charmander"
        return "bulbassauro"
    }

    if (jogador1 == "squirtle"){
        if (jogador2 == "bulbassauro")
            return "bulbassauro"
        return "squirtle"
    }
    return " "
}