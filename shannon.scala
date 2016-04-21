def shannonEntropy(str: String): Double = {
  val counts = str.groupBy(c => c)
                 .map(kv => kv._2.length)

  val len: Double = str.length
  (for {
      count <- counts
      iter = (count / len) * scala.math.log(count/len) / scala.math.log(2)
    } yield iter)
    .sum * (-1)
}

println(shannonEntropy("Hello, world!"))

// vim: set ts=2 sw=2 et sts=2:
