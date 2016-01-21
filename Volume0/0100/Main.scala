import scala.util.control.Breaks
 
object Main {
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val b = new Breaks
        b.breakable { while(sc.hasNext){
            val n = sc.nextInt
            if(n==0) b.break
            var log = Seq.empty[(Int,Int,Int)]
            for(_ <- 1 to n){
                log = log .+: (sc.nextInt, sc.nextInt, sc.nextInt)
            }
            log = log.reverse
            val logById = log groupBy{ case (id, _1, _2) => id }
            val sumById = logById map { case (id, data) =>
                val salesOnly = data map { case (id, price, num) => price * num }
                (id, salesOnly.sum)
            }
            val orderedId = sumById.toSeq.sortBy{ case (id, g) => log.indexWhere(_._1 == id)}.filter{ case (_1,_2) => _2 >= 1000000 }
            if(orderedId.size > 0) orderedId.foreach{case (id,sales) => println(id)}
            else println("NA")
 
        } }
    }
}