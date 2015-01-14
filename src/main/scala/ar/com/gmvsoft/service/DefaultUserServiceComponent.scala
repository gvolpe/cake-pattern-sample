package ar.com.gmvsoft.service

import ar.com.gmvsoft.model.Model.User
import ar.com.gmvsoft.repository.UserRepositoryComponent

trait DefaultUserServiceComponent extends UserServiceComponent {

  this: UserRepositoryComponent =>

  def userService: UserService = new DefaultUserService()

  class DefaultUserService extends UserService {

    def findAll: List[User] = userRepository.userCrud.findAll
    def save(user: User): Unit = userRepository.userCrud.save(user)
    def index(user: User): Unit = userRepository.userIndexer.index(user)

  }

}
