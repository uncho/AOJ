object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
          val a,b = sc.nextLong()
          val gcd = GCD(a,b)
          val lcm:Long = a*b / gcd
          println(gcd+" "+lcm)
        }
    }
    def GCD(a:Long, b:Long): Long = if(b==0) a else GCD(b, a%b)
}