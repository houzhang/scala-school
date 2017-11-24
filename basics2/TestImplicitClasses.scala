object Helpers {
  implicit class IntWithTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit = 
        if(current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }

  implicit class PrintHello(name: String) {
    def printHello(): Unit = {
      println("Hello " + name)
    }
  }
}

import Helpers.IntWithTimes
5 times println("HI")

import Helpers.PrintHello
"Houzhang" printHello()