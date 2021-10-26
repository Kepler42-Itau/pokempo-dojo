package pokepo

import pokepo.Pokemon.BULBASSAURO
import pokepo.Pokemon.SQUIRTLE
import pokepo.Pokemon.CHARMANDER

// Navegador-> Rod
// Pilotos:
// Henrique:
// Paulo M.
// Markus
// Elisa
// Paulo S.
// Tuco


// val map = mapOf(1 to "x", 2 to "y", -1 to "zz")

enum class Pokemon {
    CHARMANDER, // 1
    BULBASSAURO, // 2
    SQUIRTLE, // 3
}

val winnerOfBattle = mapOf(
	CHARMANDER to BULBASSAURO,
	BULBASSAURO to SQUIRTLE,
	SQUIRTLE to CHARMANDER
)

fun batalha(jogador1: Pokemon, jogador2: Pokemon) =
	if (jogador1 == jogador2)
		null
	else if (winnerOfBattle.get(jogador1) == jogador2)
        jogador1
	else
		jogador2
