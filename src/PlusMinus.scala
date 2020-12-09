object PlusMinus extends App{
  def plusMinus(arr: Array[Int]) {
    val n = arr.length
    val df = new java.text.DecimalFormat("#.######")
    var positives =0.000000
    var negatives =0.000000
    var zeros =0.000000
    for (i <- 0 until n){
      if (arr(i)<0)
        negatives += 1
      else if(arr(i)>0)
        positives+= 1
      else
        zeros+= 1
    }
    println(df.format(positives/n))
    println(df.format(negatives/n))
    println(df.format(zeros/n))
  }

  var arr = Array(-4,3,-9,0,4,1)
  plusMinus(arr)
}
