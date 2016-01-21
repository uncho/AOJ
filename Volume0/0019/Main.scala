object Main {
    def fact(n: Int) : BigInt = n match{
      case 0 => 1
      case _ => n * fact(n-1)
    }
     
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            println(fact(sc.nextInt))
        }
    }
}