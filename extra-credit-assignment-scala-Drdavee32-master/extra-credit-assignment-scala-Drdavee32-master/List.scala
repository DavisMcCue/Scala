object GFG {
  // Main method
  def main(args: Array[String]) {
    // Creating and initializing immutable lists
    val mylist1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mylist2 = List(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val mylist3 = List("Jack", "Frost", "Santa", "Claus", "Saint")

    // Display the value of mylist1
    println(mylist1)
    println(mylist2)
    println(mylist3)
    println(testList (mylist1))
    println(testList (mylist2))
    println(testList (mylist3))
  }
  //pass list and return true when function locates a 2 in the second position and false when its not
  def testList(x: Any) = x match { 
    case _ :: x :: _  if(x == 2)=> true
    case _ => false
  }
}