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
println(c.minc)
println(c.finc)

class ScientificCalculator(brand: String) extends Calculator {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

// class EvenMoreScientificCalculator(brand: String) extends ScientificCalculaator(band) {
//   def log(m: Int): Double = log(m, math.exp(1))
// }

class Greeter(perfix: String, suffix: String) {
  def greet(name: String): Unit = 
    println(perfix + name + suffix)
}

val greeter = new Greeter("Hello, ", "!")
greeter.greet("Hello")