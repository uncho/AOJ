object Main {
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val a,b,c,d,e = sc.nextInt
            val list = List(a,b,c,d,e).sortWith(_>_)
            println(list.mkString(" "))
        }
    }
}