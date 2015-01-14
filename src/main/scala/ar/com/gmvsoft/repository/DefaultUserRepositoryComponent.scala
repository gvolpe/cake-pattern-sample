package ar.com.gmvsoft.repository

import ar.com.gmvsoft.model.Model.User

trait DefaultUserRepositoryComponent extends UserRepositoryComponent {

  def userRepository: UserRepository = new UserRepositoryMemory()

  class UserRepositoryMemory extends UserRepository {

    def userIndexer: UserIndexer = new UserIndexerMemory()

    def userCrud: UserCrud = new UserCrudMemory()

    class UserCrudMemory extends UserCrud {

      def findAll: List[User] = List(User("pepe@gmail.com", "PepePallooza", Some(123)))

      def save(user: User): Unit = println("Saving user " + user.email)

    }

    class UserIndexerMemory extends UserIndexer {

      def index(user: User): Unit = println("indexing >> " + user.id + " | " + user.email)

    }

  }

}
