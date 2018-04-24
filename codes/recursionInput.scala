import io.StdIn._

def sum(n:Int):Int = {
  if(n < 1) 0
  else readInt + sum(n-1)
}
// println(sum(5))

def sumPositive():Int = {
  val input = readInt
  if(input >= 0) {
    input + sumPositive()
  } else 0
}
// println(sumPositive())

def sumUntilQuit():Int = {
  val input = readLine.toLowerCase.trim
  if(input == "quit") 0
  else input.toInt + sumUntilQuit()
}
// println(sumUntilQuit())

def sumAndCount():(Int, Int) = {
  val input = readLine.toLowerCase.trim
  if(input == "quit") (0,0)
  else {
    val (sum, count) = sumAndCount()
    (input.toInt+sum, count+1)
  }
}
// val (s, c) = sumAndCount
// println(s/c.toDouble)

def multAndCount():(Int, Int) = {
  val input = readLine.toLowerCase.trim
  if(input == "quit") (1,0)
  else {
    val (prod, count) = multAndCount()
    (input.toInt*prod, count+1)
  }
}
// println(multAndCount())

def inputAndCount(base:Int, op:(Int, Int)=>Int):(Int, Int) = {
  val input = readLine.toLowerCase.trim
  if(input == "quit") (base,0)
  else {
    val (value, count) = inputAndCount(base, op)
    (op(input.toInt, value), count+1)
  }
}

val (s,c) = inputAndCount(1, _+_)
println(s"$s, $c")

