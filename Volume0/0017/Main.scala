object Main {
    def nextAlphabet(c: Char) : Char = {
      val list = "abcdefghijklmnopqrstuvwxyz".toList
      val pos = list.indexOf(c)
      if(list(pos) == 'z') return list(0)
      else return list(pos+1)
    }
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val a = sc.nextLine
            var c = a.toCharArray
            for(i <- 0 until 26){
                for(j <- 0 until c.length){
                     if (c(j) != ' ' && c(j) != '.'){
                         c(j) = nextAlphabet(c(j))
                     }
                }
                val s = new String(c)
                if(s.contains("the") || s.contains("this") || s.contains("that")) println(s)
            }
        }
    }
}