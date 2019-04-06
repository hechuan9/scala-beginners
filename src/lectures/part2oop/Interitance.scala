package lectures.part2oop

object Interitance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }


  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)


  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("domestic")
  dog.eat

  // type substitution (board: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on class
  // 3 - seal the class = extends classes in THIS FILE only
}
