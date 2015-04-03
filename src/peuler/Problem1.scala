package peuler

object Problem1 extends App {
  
  var i = 0
  var acc = 0
  
  for (i <- 0 until 1000) {
    if (i % 3 == 0 || i % 5 == 0)
      acc += i
  }
  println(acc)
}