package ar.com.gmvsoft.service

import ar.com.gmvsoft.model.Model.User
import ar.com.gmvsoft.repository.UserRepository

trait DefaultUserService extends UserService {

  this: UserRepository =>

  def findAll: List[User] = userCrud.findAll
  def save(user: User): Unit = userCrud.save(user)
  def index(user: User): Unit = userIndexer.index(user)

}
