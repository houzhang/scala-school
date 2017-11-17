class Calculator(brand: String) {
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(m: Int, n: Int): Int = m + n
}

val calc = new Calculator("HP")
println(calc.color)