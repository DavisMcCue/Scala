object GFG {
  // Main method
  def main(args: Array[String]) {
    // Creating and initializing immutable lists
    val mylist1 = List.range(1, 1001)
    val odds = mylist1.filter(_ % 3 == 0)
    val with50 =    50 :: odds
    val with1000 = with50 :+ 1000
    val plus50 = with1000.filter(_ > 49)
    val evens = plus50.filter((i: Int) => i % 2 == 0)
    val doubleItems = evens.map( (x:Int) => x * 2 )
    println(1::odds)
    println(plus50)
    println(evens)
    println(doubleItems)
    println(sum(doubleItems))
    
  }
  def sum(list: List[Int]): Int = list.foldLeft(0)(_+_)
}
  