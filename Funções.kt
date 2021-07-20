// Prefixo fun nomeDaFunção(nome:Tipo):TipoRetorno{}

// Funções anônimas, single-line, inline, extensões, lambdas, ordem superior 

 private fun getFullName(name:String, lastName:String): String {
   val fullname = "$name $lastname"
   return fullname
 }

 private fun getFullName(name:String, lastName:String): String {
   return "$name $fullname"
 }

 private fun getFullName(name:String, lastName:String) = "$name $lastName"

 // TODAS AS FINÇÕES fazem a mesma coisa coisa, a diferença é que a última está bem mais simplificada