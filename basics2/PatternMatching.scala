val times = 3;

// times match {
//   case 1 => "one"
//   case 2 => "two"
//   case _ => "some ohter number"
// }

times match {
  case i if i == 1 => println("one")
  case i if i == 2 => println("two")
  case _ => println("some other number")
}

def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => println("i < 0")
    case i: Int => println("i is integer >= 0")
    case d: Double if d < 0.0 => println("is double < 0.0")
    case d: Double => println("is double >= 0.0")
    case text: String => println("is text")
  }
}

bigger(-3)
bigger(0)
bigger(3)
bigger(-3.3)
bigger(0.0)
bigger(3.4)
bigger("hello")