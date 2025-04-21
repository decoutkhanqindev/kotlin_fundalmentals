fun main() {
  val amanda = Person(
    name = "Amanda",
    age = 33,
    hobby = "play tennis",
    referrer = null
  )
  val atiqah = Person(
    name = "Atiqah",
    age = 28,
    hobby = "climb",
    referrer = amanda
  )

  amanda.showProfile()
  atiqah.showProfile()
}


class Person(
  val name: String,
  val age: Int,
  val hobby: String?,
  val referrer: Person?
) {
  fun showProfile() {
    println("Name: $name")
    println("Age: $age")
    if(hobby != null) {
      print("Likes to $hobby. ")
    }
    if(referrer != null) {
      print("Has a referrer named ${referrer.name}")
      if(referrer.hobby != null) {
        print(", who likes to ${referrer.hobby}.")
      } else {
        print(".")
      }
    } else {
      print("Doesn't have a referrer.")
    }
    print("\n\n")
  }
}