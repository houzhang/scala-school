import io.StdIn._

// scala names.scala < ND.TXT

type NameData = (String, Int, String, Int)

def parseLine(line: String): NameData = {
  val parts = line.split(",")
  (parts(1), parts(2).toInt, parts(3), parts(4).toInt)
}

val nameLines = Array.fill(45522)(readLine)
val nameData = nameLines.map(parseLine)

val minYear = nameData.map(_._2).min
val maxYear = nameData.map(_._2).max
println(minYear)
println(maxYear)

def printPopularFemaleNameInYear(year: Int): Unit = {
  val femaleInYear = nameData.filter(nd => nd._1 == "F" && nd._2 == year)
  val maxFemaleInYear = (femaleInYear.map(_._4).max)

  femaleInYear.filter(nd => nd._4 == maxFemaleInYear).foreach(println)
}

for (year <- minYear to maxYear) {
  printPopularFemaleNameInYear(year)
}
