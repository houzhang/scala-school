case class Calculator(brand: String, model: String)

val hp20b = Calculator("HP", "20b")

val hp20B = Calculator("HP", "20b")

println(hp20b == hp20B)