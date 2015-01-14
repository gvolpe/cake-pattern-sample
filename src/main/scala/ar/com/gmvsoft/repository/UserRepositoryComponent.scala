package ar.com.gmvsoft.repository

import ar.com.gmvsoft.model.Model.User

trait UserRepositoryComponent {

  def userRepository: UserRepository

  trait UserRepository {

    def userIndexer: UserIndexer

    def userCrud: UserCrud

    trait UserCrud {

      def findAll: List[User]

      def save(user: User): Unit

    }

    trait UserIndexer {

      def index(user: User): Unit

    }

  }

}
