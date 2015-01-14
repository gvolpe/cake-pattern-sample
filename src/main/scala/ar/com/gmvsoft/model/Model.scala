package ar.com.gmvsoft.model

object Model {

  case class User(email: String, name: String, id: Option[Int] = None)

}
