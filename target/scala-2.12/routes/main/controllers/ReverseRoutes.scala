// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/dojonode/Documents/petstore/conf/routes
// @DATE:Sat Mar 03 11:42:15 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def actualizarMascotaSQL(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "actualizarSQL")
    }
  
    // @LINE:18
    def actualizarMascota(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "actualizar")
    }
  
    // @LINE:13
    def getMascotas(): Call = {
    
      () match {
      
        // @LINE:13
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "mascotas")
      
      }
    
    }
  
    // @LINE:19
    def removerMascota(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "eliminar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:17
    def insertarMascota(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insertar")
    }
  
    // @LINE:25
    def removerMascotaSQL(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "eliminarSQL/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:22
    def getMascotasSQL(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mascotasSQL")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:23
    def insertarMascotaSQL(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insertarSQL")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
