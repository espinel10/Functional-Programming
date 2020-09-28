
import scala.collection.mutable



def f(num:Int,arr:List[Int]):List[Int]={
 val l=mutable.Stack[Int]()
 val iter =List.range(0,num)
 for (x <- arr){
   for(k<-iter){
     l.push(x)
   }
 }
 l.toList.reverse
}
