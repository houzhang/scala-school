val x:Int = "2"

implicit def asInt(x: String): Int = augmentString(x).toInt

// println(x)

def sayAnswer(x: Int): Unit = {
  println(x)
}

// sayAnswer("2")

implicit val answer = 42

def whatIsTheAnswer(implicit ans: Int): Unit = {
  ans match {
    case 42 => println("Yes. 42 is the answer to Life, Universe and Everything")
    case _ => s"Nope, $ans is not the answer"
  }
}

whatIsTheAnswer

class AnswerToAll {
  def answer = "The answer to life."
}

implicit class WithGetAnswer(convertFrom: AnswerToAll) {
  def getAnswer = convertFrom.answer
}

println((new AnswerToAll).getAnswer)
