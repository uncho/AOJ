object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val n = sc.nextInt
            val list = for(a <- 0 to 9; b <- 0 to 9; c <- 0 to 9; d <- 0 to 9 if a+b+c+d == n) yield 1
            println(list.size)
        }
    }
}