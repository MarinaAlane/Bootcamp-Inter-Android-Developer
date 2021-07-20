// Função de ordem superior 

// HOF como no js, recebe outra função como parâmetro

// ex 
val x = calculate(12,4 :: sim)
val y = calculate(12,4){ a,b -> a*b }

// Usar quando quiser uma generalização
// Tratamento de erro e de sucesso, como parâmetros

fun main() {
  val z:Int

   z = calculate(34,90){ a,b ->
  println("Calculando..")}
  a+b
}

fun main() {
  val z:Int
  
  z = calculate(34,90, ::sum)
  println(z)
}

fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation: (Int, Int) ->Int):Int{
  val result= operation(n1,n2)
  return result
}

fun main() {
  val z:Int
  
  z = calculate(34,90) { a, b -> a*b}
  println(z)
}

fun calculate(n1:Int, n2:Int, operation: (Int, Int) ->Int):Int{
  val result= operation(n1,n2)
  return result
}