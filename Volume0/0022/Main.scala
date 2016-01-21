import scala.util.control.Breaks
 
object Main {
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val break = new Breaks
        break.breakable{
            while(sc.hasNext){
                val n = sc.nextInt
                if(n == 0) break.break
                var list = List.empty[Int]
                for(_ <- 1 to n){
                    val a = sc.nextInt
                    if(list.isEmpty) list = a :: list
                    else list = Math.max(list.take(1)(0) + a, a) :: list
                }
                println(list.max)
            }
        }
    }
}