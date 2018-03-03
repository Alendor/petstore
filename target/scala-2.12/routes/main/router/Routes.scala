// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/dojonode/Documents/petstore/conf/routes
// @DATE:Sat Mar 03 11:42:15 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:10
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:10
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mascotas""", """controllers.HomeController.getMascotas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mascotas""", """controllers.HomeController.getMascotas"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertar""", """controllers.HomeController.insertarMascota"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actualizar""", """controllers.HomeController.actualizarMascota"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminar/""" + "$" + """id<[^/]+>""", """controllers.HomeController.removerMascota(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mascotasSQL""", """controllers.HomeController.getMascotasSQL"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertarSQL""", """controllers.HomeController.insertarMascotaSQL"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actualizarSQL""", """controllers.HomeController.actualizarMascotaSQL"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarSQL/""" + "$" + """id<[^/]+>""", """controllers.HomeController.removerMascotaSQL(id:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_getMascotas2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mascotas")))
  )
  private[this] lazy val controllers_HomeController_getMascotas2_invoker = createInvoker(
    HomeController_0.getMascotas,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getMascotas",
      Nil,
      "GET",
      this.prefix + """mascotas""",
      """ Rutas propias del aplicativo PetStore""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_getMascotas3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mascotas")))
  )
  private[this] lazy val controllers_HomeController_getMascotas3_invoker = createInvoker(
    HomeController_0.getMascotas,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getMascotas",
      Nil,
      "GET",
      this.prefix + """mascotas""",
      """ Rutas propias del aplicativo PetStore""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_insertarMascota4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertar")))
  )
  private[this] lazy val controllers_HomeController_insertarMascota4_invoker = createInvoker(
    HomeController_0.insertarMascota,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertarMascota",
      Nil,
      "POST",
      this.prefix + """insertar""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_actualizarMascota5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actualizar")))
  )
  private[this] lazy val controllers_HomeController_actualizarMascota5_invoker = createInvoker(
    HomeController_0.actualizarMascota,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "actualizarMascota",
      Nil,
      "PUT",
      this.prefix + """actualizar""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_removerMascota6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_removerMascota6_invoker = createInvoker(
    HomeController_0.removerMascota(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removerMascota",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """eliminar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_getMascotasSQL7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mascotasSQL")))
  )
  private[this] lazy val controllers_HomeController_getMascotasSQL7_invoker = createInvoker(
    HomeController_0.getMascotasSQL,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getMascotasSQL",
      Nil,
      "GET",
      this.prefix + """mascotasSQL""",
      """ Rutas propias del aplicativo PetStore para la version con MySQL""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_insertarMascotaSQL8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertarSQL")))
  )
  private[this] lazy val controllers_HomeController_insertarMascotaSQL8_invoker = createInvoker(
    HomeController_0.insertarMascotaSQL,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertarMascotaSQL",
      Nil,
      "POST",
      this.prefix + """insertarSQL""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_actualizarMascotaSQL9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actualizarSQL")))
  )
  private[this] lazy val controllers_HomeController_actualizarMascotaSQL9_invoker = createInvoker(
    HomeController_0.actualizarMascotaSQL,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "actualizarMascotaSQL",
      Nil,
      "PUT",
      this.prefix + """actualizarSQL""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_removerMascotaSQL10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarSQL/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_removerMascotaSQL10_invoker = createInvoker(
    HomeController_0.removerMascotaSQL(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removerMascotaSQL",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """eliminarSQL/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_HomeController_getMascotas2_route(params@_) =>
      call { 
        controllers_HomeController_getMascotas2_invoker.call(HomeController_0.getMascotas)
      }
  
    // @LINE:16
    case controllers_HomeController_getMascotas3_route(params@_) =>
      call { 
        controllers_HomeController_getMascotas3_invoker.call(HomeController_0.getMascotas)
      }
  
    // @LINE:17
    case controllers_HomeController_insertarMascota4_route(params@_) =>
      call { 
        controllers_HomeController_insertarMascota4_invoker.call(HomeController_0.insertarMascota)
      }
  
    // @LINE:18
    case controllers_HomeController_actualizarMascota5_route(params@_) =>
      call { 
        controllers_HomeController_actualizarMascota5_invoker.call(HomeController_0.actualizarMascota)
      }
  
    // @LINE:19
    case controllers_HomeController_removerMascota6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_removerMascota6_invoker.call(HomeController_0.removerMascota(id))
      }
  
    // @LINE:22
    case controllers_HomeController_getMascotasSQL7_route(params@_) =>
      call { 
        controllers_HomeController_getMascotasSQL7_invoker.call(HomeController_0.getMascotasSQL)
      }
  
    // @LINE:23
    case controllers_HomeController_insertarMascotaSQL8_route(params@_) =>
      call { 
        controllers_HomeController_insertarMascotaSQL8_invoker.call(HomeController_0.insertarMascotaSQL)
      }
  
    // @LINE:24
    case controllers_HomeController_actualizarMascotaSQL9_route(params@_) =>
      call { 
        controllers_HomeController_actualizarMascotaSQL9_invoker.call(HomeController_0.actualizarMascotaSQL)
      }
  
    // @LINE:25
    case controllers_HomeController_removerMascotaSQL10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_removerMascotaSQL10_invoker.call(HomeController_0.removerMascotaSQL(id))
      }
  }
}
