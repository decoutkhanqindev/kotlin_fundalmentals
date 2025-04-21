fun main() {
  val brunoSong = Song(
    title = "We Don't Talk About Bruno",
    artist = "Encanto Cast",
    yearPublished = 2022,
    playCount = 1_000_000 // 1000000
  )
  brunoSong.printDescription()
  println(brunoSong.isPopular)
}

class Song(
  val title: String,
  val artist: String,
  val yearPublished: Int,
  val playCount: Int
) {
  val isPopular: Boolean
    get() = playCount >= 1000

  fun printDescription() {
    println(
      "$title, performed by $artist, was released in $yearPublished."
    )
  }
}