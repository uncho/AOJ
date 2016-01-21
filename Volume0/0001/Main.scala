object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val list = List.fill(10)(sc.nextInt).sorted.reverse.take(3)
        list.foreach(println)
    }
}