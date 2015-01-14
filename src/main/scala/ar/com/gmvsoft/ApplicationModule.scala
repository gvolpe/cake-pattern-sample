package ar.com.gmvsoft

import ar.com.gmvsoft.repository.UserRepositoryMemory
import ar.com.gmvsoft.service.DefaultUserService


object ApplicationModule {

  val userService = new DefaultUserService with UserRepositoryMemory {}

}
