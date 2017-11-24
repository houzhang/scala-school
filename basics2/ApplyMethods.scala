class Foo {}

object FooMaker {
  def apply() = new Foo
}

val newFoo = FooMaker()

class Bar {
  def apply() = { println("apply methods") }
}

val bar = new Bar
bar()
