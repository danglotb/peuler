package peuler

object Problem4 extends App{

  def isPalindrome(value : String) : Boolean = {
    
    var i = 0
    var j = (value.length-1)
    
    while (i != j && j > i) {
      if ( (value.charAt(i)) != value.charAt(j))
        return false
      i += 1
      j -= 1
    }    
    return true 
  }
  
  println("Before Loop")
  
  var max = 0
  
  for (i <- 100 until 1000){
    for (j <- 100 until 1000) {
      if (isPalindrome((i*j).toString()))
        if (max < i*j)
          max = i*j
    }
  }
  print(max)
}