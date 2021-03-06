abstract class Animal {
  def name: String
}

case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal

def printAnimalNames(animals: List[Animal]) : Unit = {
  animals.foreach { animal =>
    println(animal)
  }
}

val cats: List[Cat] = List(Cat("cat a"), Cat("cat b"))
val dogs: List[Dog] = List(Dog("dog a"), Dog("dog b"))

printAnimalNames(cats)
printAnimalNames(dogs)


abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit = 
    println("The animal's name is " + animal.name)
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit = 
    println("The cat's name is " + cat.name)
}

val myCat: Cat = Cat("Boots")

def printMyCat(printer: Printer[Cat]): Unit = {
  printer.print(myCat)
}

val catPrinter: Printer[Cat] = new CatPrinter
val animalPrinter: Printer[Animal] = new AnimalPrinter

printMyCat(catPrinter)
printMyCat(animalPrinter)

class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(value: A): Unit = {
    _value = value
  }
}

val catContainer: Container[Cat] = new Container(Cat("Felix"))
val animalContainer: Container[Animal] = catContainer
animalContainer.setValue(Dog("Spot"))
