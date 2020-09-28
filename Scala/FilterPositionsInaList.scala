import scala.collection.mutable
def f(arr:List[Int]):List[Int] = {
val l=mutable.Stack[Int]()
val iter =List.range(0,arr.length)
for(e<-iter) if (e%2!=0) l.push(arr(e))
l.toList.reverse
}
