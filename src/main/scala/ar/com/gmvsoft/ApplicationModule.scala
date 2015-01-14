package ar.com.gmvsoft

import ar.com.gmvsoft.repository.DefaultUserRepositoryComponent
import ar.com.gmvsoft.service.DefaultUserServiceComponent


object ApplicationModule {

  val userServiceComponent = new DefaultUserServiceComponent with DefaultUserRepositoryComponent {}
  val userService = userServiceComponent.userService

}
