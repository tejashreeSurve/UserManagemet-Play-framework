// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teju/Downloads/play-sample-project/conf/routes
// @DATE:Fri Jul 10 17:15:12 IST 2020


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
