import java.util.Date

trait Timestamped {
  def timestamped = new Date
}
class Mongo[A] extends Timestamped

object TestMe extends App {
  
  println(foo(new Mongo))
  
  def foo[A <: Mongo[_] with Timestamped](a: A) = a
}