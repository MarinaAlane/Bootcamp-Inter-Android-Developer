// Funções extensões

// prefixo - Fun Tipo.nomeDaFunção()

// Cria uma função que só pode ser chamada por um tipo esécífico, cujo o valor pode ser referenciado
// dentro da função através da palavra this.

fun main() {
  fun String.randomCapitalizedLetter() = 
      this[(0..this.length-1).random()].uppercaseChar()
  }
// A função só pode ser chamada por variáveis do tipo string
//ToUpperCase é depreciado.