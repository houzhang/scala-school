class Calculator {
  val brand: String = "HP"
  def add(m: Int, n: Int): Int = m + n
}

val calc = new Calculator
println(calc.add(2,3))

println(calc.brand)

class C {
  var acc = 0
  def minc = { acc += 1 }
  val finc = { () => acc += 1 }
}

val c = new C
println(c.minc
println(c.finc)

class ScientificCalculaator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

class EvenMoreScientificCalculator(brand: String) extens ScientificCalculaator(brand) {
  def log(m: Int): Double = log(m, math.exp(1))
}