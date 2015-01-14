package ar.com.gmvsoft.service

import ar.com.gmvsoft.model.Model.User

trait UserServiceComponent {

  def userService: UserService

  trait UserService {

    def findAll: List[User]

    def save(user: User): Unit

  }

}
