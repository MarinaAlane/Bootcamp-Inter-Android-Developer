// Estruturas de controle 
// if/else, when, elvis operator
// Pode ser Utilizado tanto para controle quanro para atribuições
// Pode ser encadeado em múltiplas estruturas

// when da mesma forma que o switch case 

// elvis operator
val a:Int? = null
var number = a ?: 0

if(expressão){
  // bloco de código
} else if( expressão2) {
  // bloco de código
}else {
  // bloco de código
}

// Quando o if for maior que 3 condicionais, melhor usar o when
when {
  case1 -> {// código}
  case2 -> { // código}
  case3 -> { // código}
  else -> { // código }
}

fun main() {
  val grade = (0..10).random()
    println(grade.getStudentsStatus())
  }
  
  fun Int.getStudentsStatus():String{
      println("nota $this")
      
      return when(this) {
          in 0..4 -> "Reprovado"
          in 5..7 -> "Mediano"
          in 8..9 -> "Bom"
          10 -> "Excelente"
          else -> "Indefinido"
      }
  }

// Elvis operator -> mais próxinmo de op ternário
// verifica se um valor é nulo e apresenta uma opção casi seja 

val a:Int? = null
val c:Int? = 9
var number = a?: ?: 0

// Nesse caso se o valor de a não for nulo, number recebe apresentaSe o valor de a for nulo e b
// não for nulo, number recebe b 
// Se a e b forem nulos, number recebe 0