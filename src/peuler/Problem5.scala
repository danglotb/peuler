package peuler

/**
 * @author B�ni
 */
object Problem5 extends App {
  
  def isAGoodNumber(value : Int ) : Boolean = {
    for (i <- 1 until 20) {
      if (value % i != 0)
      return false  
    }
    return true
  }
  
  var i = 1
  
  while (!isAGoodNumber(i)) {
    i+=1
  }
    
    print(i)
  
}