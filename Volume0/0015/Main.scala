import java.math.BigInteger
 
object Main {
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val n = sc.nextInt
        val max = new BigInteger("1"+"0"*80)
        while(sc.hasNext){
            val a = sc.nextBigInteger
            val b = sc.nextBigInteger
            val sum = a.add(b)
            if(sum.compareTo(max) == -1) println(sum)
            else println("overflow")
             
        }
    }
}