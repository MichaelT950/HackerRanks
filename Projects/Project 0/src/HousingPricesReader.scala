/**HousingPricesReader
 *
 */
object HousingPricesReader extends App{

  println("What file would you like to read?")

  val fileName = scala.io.StdIn.readLine()
  val helpInstructions = "HelpInstructions"
  val helpFile = io.Source.fromFile(helpInstructions)

  //INITIATE APP
  println("Here are a list of commands: " )
  readInst()
  initState()

  //POST FUNCTIONS HERE
  //make a read instructions function
  def readInst () ={
    for (ln <- helpFile.getLines()) println(ln)
  }
  def initState() = {
    println("What would you like to do?")
    println("  1 - Print Values    ")

    //USE EXCEPTION HANDLING FOR CASES THAT ARENT ALLOWED. USE lINK BELOW FOR HELP.
    //https://docs.scala-lang.org/overviews/scala-book/functional-error-handling.html
    val cmd = scala.io.StdIn.readLine()
    val init =  cmd match {
      case "1" => printHouses()
    }
  }

  def printHouses() = {
    val file = io.Source.fromFile(fileName)
    for (ln <- file.getLines().drop(1)) {
      val Array(index, sqft, beds, baths, zip, year, price) = ln.split(",").map(_.trim)
      println(s"$index $sqft $beds $baths $zip $year $price")
    }
  }

}
