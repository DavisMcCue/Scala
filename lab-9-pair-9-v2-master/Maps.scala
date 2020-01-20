object Maps
{
  def main(args: Array[String]): Unit =
  {
    val d: List[Int] = List.range(1, 11)
    var new_d = d.map(x => x % 2 == 0)
    var squaringList = d.map(x => x*x)
    var newvariable = whichEven(d)

    println("Lab 9 Part 2")
    println(d)
    println(new_d)
    println(squaringList)
    println(newvariable)
  }
  def whichEven(a: List[Int]): Unit = a.map(x => x % 2 == 0)
}