object Test extends App{
  /*
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
  def diagonalDifference(arr: Array[Array[Int]]): Int  = {
  {
    // Write your code here
    var sol:Int = 0
    var left:Int = 0
    var right:Int = 0
    for (i <- 0 to arr.length-1){
      left += arr(i)(i)
      right += arr(i)(arr.length-1-i)
    }
    sol = (left - right).abs
    sol
  }
  }

  /*
   * Tests the Code
   */
  val arr = Array(Array(1, 2, 3),
                  Array(4, 5, 6),
                  Array(9, 8, 9))
  println(diagonalDifference(arr))
}
