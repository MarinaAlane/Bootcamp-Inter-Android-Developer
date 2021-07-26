// while, do..while, for e forEach 
// Aceita comandos de in, range, until, downTo e step 

// do..While vai fazer a validação no fim. 
 
fun main() {
  letters()
  
 for(i in 0..20){
     print(" $i ")
 }
}
 
fun downtTo() {
    for(i in 20 downTo 5){
     print("$i ")
 }
}

  fun until() {
    for(i in 0 until 20){
     print("$i ")
 }
}
  
  fun step(num:Int) {
  for(i in 0..20 step num){
   print("$i ")
 }
}
  
 fun letters(){
     val sArray = "que maneiro!"
     for (l in sArray){
         println(l.toUpperCase())
     }
 }