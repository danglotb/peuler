package peuler

/**
 * @author Béni
 */
object Problem3 extends App{
  
  /**
   * Too Long
   */
  def isPrime(value : Int) : Boolean = {
    for (i <- 2 until value) {
      if (value%i == 0)
        return false
    }
    return true;
  }
  
   def isPrime(value : Long) : Boolean = {
    for (i <- 2 until value.toInt) {
      if (value%i == 0)
        return false
    }
    return true;
  }
  
  /**
   * Sieve of Eratosthenes
   */
  
  def sieveOfEra(stop : Int) : Seq[Int] = {

     println("Init")
    
    var r = Seq[Int]()
    for (i <- 2 until stop+1) {
      println(i)
       r = r :+ i
    }
    
    var curr = 2
    
    println("Compute Prime Numbers")
    
    /* rm all multiple of prime number */
    while(curr != stop) {
      r = r diff (r.filter{ p => p%curr==0 && p != curr})
      curr += 1
    }
    
    println("End")
    
    r
  }
  
  var target = 600851475143L
  var stop = scala.math.sqrt(target).floor.toInt
  var i = 2
  var max = 0
  while(i < stop) {
    if (target % i == 0) {
      target = target / i
      if (max < i)
        max = i 
   }
      i += 1
  }
  print(max)
  
}