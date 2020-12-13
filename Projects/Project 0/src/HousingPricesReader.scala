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
  println(readInst())

  //POST FUNCTIONS HERE
  //make a read instructions function
  def readInst () ={
    for (ln <- helpFile.getLines()) println(ln)
  }

  val file = io.Source.fromFile(fileName)
  for (ln <- file.getLines().drop(1)){
    val Array( index,sqft, beds, baths, zip, year, price) = ln.split(",").map(_.trim)
    //println( s"$index $sqft $beds $baths $zip $year $price")
  }

}
