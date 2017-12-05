case class Calculator(brand: String, model: String)

val hp20b = Calculator("HP", "20b")

val hp20B = Calculator("HP", "20b")

val hp30B = Calculator("HP", "30B")

println(hp20b == hp20B)

def calcType(calc: Calculator) =  calc match {
  
}