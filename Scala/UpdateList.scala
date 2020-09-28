import scala.collection.mutable
def f(arr:List[Int]):List[Int] ={

      val retorno=mutable.Stack[Int]()
      for (e<-arr){
        var abs=e
        if (e<0){
          abs=abs*(-1)
        }
        retorno.push(abs)

      }
      retorno.toList.reverse
    }
