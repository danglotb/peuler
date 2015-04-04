package peuler

/**
 * @author B�ni
 */
object Problem6 extends App {
  var x = 0L
  var y = 0L
  for (i <- 1 until 101) {
    x += (i*i)
    y += i
  }
  y = y * y
  println(x)
  println(y)  
  print(y-x)
}