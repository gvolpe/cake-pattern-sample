package ar.com.gmvsoft

import ar.com.gmvsoft.model.Model.User
import ar.com.gmvsoft.repository.UserRepositoryMemory
import ar.com.gmvsoft.service.DefaultUserService
import org.specs2.mutable._

object UserTestSpec extends Specification {

  "find all users " in {

    val users = List(User("pepe@gmail.com", "PepePallooza", Some(123)))

    val userService = new DefaultUserService with UserRepositoryMemory {}

    userService.findAll must_== users

  }

}
