// Var - valor mutável CamelCase

// Val - constante 

// Const Val = constante que valor é atribuído durante compilação - SNAKE_CASE

// 3 formas de atribuir variável:
var currentAge = 22

var currentAge:Int?
// ? é forma resumida de informar que valor pode ser null
currentAge = null ou 22
// Recebe valor 22 e o tipo inteiro

const val MIN_AGE 16
const val MAX_AGE 68

// valor definido enquanto o código está sendo construído. Geralmente usando valor para consulta
fun main() {
  val age:Int
  age = 25

  println(age)
}

// Possíveis erros na atribuição do código

// Uma variável não pode ser declarada sem tipo ou atribuição