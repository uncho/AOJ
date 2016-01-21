object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext()){
          val str = sc.next
          println(str.reverse)
        }
    }
}