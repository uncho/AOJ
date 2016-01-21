object Main {
    def f(x: Int) = x*x
   
    def divisionQuadrature(d: Int) = {
        def divisionQuadrature(d: Int, d2: Int) : Int = {
            if(d2 >= 600) return 0
            else return f(600-d2)*d + divisionQuadrature(d, d2+d)
        }
        divisionQuadrature(d, d)
    }
     
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val a = sc.nextInt
            val ans = divisionQuadrature(a)
            println(ans)
        }
    }
}