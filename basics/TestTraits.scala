trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}

class BMW extends Car with Shiny {
  val brand = "BMW"
  val shineRefraction = 12
}

println(new BMW().shineRefraction)



trait Greeter {
  def greet(name: String): Unit = 
    println("Hello, " + name)
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("Houzhang")

val customGreeter = new CustomizableGreeter("Hey, ", "!")
customGreeter.greet("Houzhang")
