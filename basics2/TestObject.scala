object Timer {
  var count = 0

  def currentCount(): Long = {
    count +=1
    count
  }
}

println(Timer.currentCount())

class Bar(foo: String)

object Bar {
  def apply(foo: String) = new Bar(foo)
}

println(Bar("test"));


object addOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
}

println(addOne(1))

class addOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
}

val plusOne = new addOne()
println(plusOne(1))

