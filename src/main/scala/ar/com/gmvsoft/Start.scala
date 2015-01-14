package ar.com.gmvsoft

import ar.com.gmvsoft.model.Model.User

object Start extends App {

  val userService = ApplicationModule.userService
  val users: List[User] = userService.findAll

  users.foreach { user =>
    println(user.id + " | " + user.name + " | " + user.email)
  }

}
