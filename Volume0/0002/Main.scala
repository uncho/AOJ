object Main {
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext()){
          val a, b = sc.nextInt()
          println((a+b).toString.size)
        }
    }
}