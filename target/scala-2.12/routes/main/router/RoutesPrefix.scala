// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/dojonode/Documents/petstore/conf/routes
// @DATE:Sat Mar 03 11:42:15 COT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
