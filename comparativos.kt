const val EQUAL = 0
const val LESS = -1
const val MORE = 1
// // função principal
fun main() {
  val a = 220
  val b = 219
println(a >= b)
println(a.compareTo(b) >= EQUAL)
}


fun main() {
  val a = 220
  val b = 219
// println(a >= b)
println(a.compareTo(b))
}

fun main() {
  val a = 220
  val b = 219
// println(a >= b)
println(a.equals(b))
}
fun main() {
  val a = 220
  val b = 219
// println(a >= b)
println(!a.equals(b))
}