package ar.com.gmvsoft

import ar.com.gmvsoft.model.Model.User
import org.specs2.mutable._

object UserTestSpec extends Specification {

  "find all users " in {

    val users = List(User("pepe@gmail.com", "PepePallooza", Some(123)))

    val userService = ApplicationModule.userService

    userService.findAll must_== users

  }

}
