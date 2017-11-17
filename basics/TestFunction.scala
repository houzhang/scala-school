def timesTwo(i: Int): Int = {
  println("hello world")
  i * 2
}

timesTwo(1)

{ i: Int =>
  println("hello world")
  i * 2
}

def three() = 1 + 2
println(three())


def adder(m: Int, n: Int) = m + n
println(adder(3,3))

val add2 = adder(2, _:Int)
println(add2(3))

def multiply(m: Int)(n: Int): Int = m * n
println(multiply(3)(3))

val timesTwo1 = multiply(2) _
println(timesTwo1(5))

val curriedAdd = (adder _).curried
val addTwo = curriedAdd(2)
println(addTwo(4))

def capitalizeAll(args: String*) = {
  args.map {arg =>
    arg.capitalize
  }
}
println(capitalizeAll("rarity", "houzhang"))