package peuler

/**
 * @author Béni
 */


class Fibonacci {
  
  val end = 4000000
  
  var current = 1
  var nextCurrent = 2
  
  var acc = 0 
  
  def getNextTerm() : Int = {
    val tmp = current + nextCurrent
    current = nextCurrent
    nextCurrent = tmp
    if (current % 2 == 0)
      acc += current
    tmp
  }
  
  def isFinish() : Boolean = {
    return nextCurrent >= end
  }
}

object Problem2 extends App {
  
    val f = new Fibonacci()
  
    while (!f.isFinish())
      f.getNextTerm()
      
    print(f.acc)  
  
}