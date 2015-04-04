package peuler

/**
 * @author B�ni
 */
object Problem7 extends App{

  var count = 0
  
  var curr = 2
  
  while (count != 10001) {
    if (Problem3.isPrime(curr)) {
      count += 1
    }
    curr += 1
  }
  print(curr)
}

