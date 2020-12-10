/**
 * Reads Zillow housing prices csv file and stores rows in an array
 */
object HousingPricesReader extends App{

  val file = io.Source.fromFile("zillow.csv")
  for (ln <- file.getLines().drop(1)){
    val Array( index,sqft, beds, baths, zip, year, price) = ln.split(",").map(_.trim)
    println(s"$index $sqft $beds $baths $zip $year $price")
  }

}
