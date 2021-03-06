case class User(id: Int)
case class UserContext(id: Int, details: PersonalDetails, account: Account)
case class ProductSelection(productIds: List[Int])

case class PersonalDetails(/* some fields here */)
case class Account(/* some fields here */)

def purchase(userId: Int, selection: ProductSelection): Either[String, Int] = {
  implicit val userContext = getUserContext(userId)
  for {
    _ <- validateAddressWithinDistance
    _ <- validateSelection(selection)
    _ <- validateBalance(selection)
  } yield placeOrder(selection)
}

private def getUserContext(userId: Int): UserContext = ???

private def validateBalance(selection: ProductSelection)
                           (implicit userContext: UserContext): Either[String, Double] = ???

private def validateAddressWithinDistance(
              implicit userContext: UserContext): Either[String, UserContext] = ???

private def validateSelection(selection: ProductSelection)
                             (implicit userContext: UserContext): Either[String, ProductSelection] = ???

private def placeOrder(selection: ProductSelection)
                      (implicit userContext: UserContext): Int = ???
