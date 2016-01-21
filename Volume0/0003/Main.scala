object Main {
    def square(x: BigInt): BigInt = x * x
     
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val N = sc.nextInt
        for(i <- 0 until N){
          val list = List.fill(3)(sc.nextInt).sorted.reverse
          if(square(list(0)) == square(list(1)) + square(list(2))) println("YES") else println("NO")
        }
         
    }
}