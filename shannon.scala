def shannonEntropy(str: String): Double = {
  val count = scala.collection.mutable.Map[Char, Double]()

  for (s <- str) {
    val currentCount = count.getOrElseUpdate(s, 0)
    count.update(s, currentCount+1)
  }

  val len: Double = str.length
  var sum = 0.0
  for ((k, v) <- count) {
      sum += (v / len) * scala.math.log(v/len) / scala.math.log(2)
    }
  -1 * sum
}

println(shannonEntropy("Hello, world!"))

// vim: set ts=2 sw=2 et sts=2:
