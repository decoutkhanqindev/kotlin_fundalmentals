fun main() {
  val winningBid = Bid(
    amount = 5000,
    bidder = "Private Collector"
  )

  println(
    "Item A is sold at ${
      auctionPrice(
        bid = winningBid,
        minimumPrice = 2000
      )
    }."
  )
  println(
    "Item B is sold at ${
      auctionPrice(
        bid = null,
        minimumPrice = 3000
      )
    }."
  )
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
  return bid?.amount ?: minimumPrice
  // return if (bid != null) bid.amount else minimumPrice
}