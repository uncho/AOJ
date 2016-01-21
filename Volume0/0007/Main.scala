object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val n = sc.nextInt
            var debt = 100000
            for(i <- 1 to n){
               debt = (debt * 1.05).asInstanceOf[Int]
               debt = if (debt%1000 != 0) ((debt/1000)+1) * 1000 else (debt/1000) * 1000
            }
            println(debt)
        }
    }
}