// in === contém. Entra no lugar de estruturas de repetição
// Verificia se o valor está presente naquele array/string

// range = cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo

fun main() {
  val numbers = listOf(2,9,5,15,20)
  val number = 20
// println(a >= b)
println(number in numbers)
}

const val MAX_AGE = 68
const val MIN_AGE = 16
// // função principal
fun main() {
  val age = (10..100).random()
  println(age)
// println(a >= b)
println(age in MIN_AGE..MAX_AGE)
// RANGE = ..
println(age >= MIN_AGE && age <= MAX_AGE)
}