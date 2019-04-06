package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  person.greet("Daniel")

}

// constructor
class Person(name: String, val age: Int = 0)  {
  // body
  val x = 2

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
}

// class parameters are NOT FIELDS

class Counter(val count: Int) {
  def inc: Counter = {
    println("incrementing")
    new Counter(count + 1)
  }

  def dec: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.inc(n-1)
  }

  def print = println(count)

}
