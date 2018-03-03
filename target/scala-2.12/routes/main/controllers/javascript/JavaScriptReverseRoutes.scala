// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/dojonode/Documents/petstore/conf/routes
// @DATE:Sat Mar 03 11:42:15 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def actualizarMascotaSQL: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.actualizarMascotaSQL",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizarSQL"})
        }
      """
    )
  
    // @LINE:18
    def actualizarMascota: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.actualizarMascota",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizar"})
        }
      """
    )
  
    // @LINE:13
    def getMascotas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getMascotas",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mascotas"})
          }
        
        }
      """
    )
  
    // @LINE:19
    def removerMascota: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.removerMascota",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def insertarMascota: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertarMascota",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertar"})
        }
      """
    )
  
    // @LINE:25
    def removerMascotaSQL: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.removerMascotaSQL",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarSQL/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:22
    def getMascotasSQL: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getMascotasSQL",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mascotasSQL"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:23
    def insertarMascotaSQL: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertarMascotaSQL",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertarSQL"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
