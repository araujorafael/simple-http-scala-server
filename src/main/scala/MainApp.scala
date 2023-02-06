import zio._
import zhttp.service.Server
import example_app.ExampleApp

object MainApp extends ZIOAppDefault {
  def run =
    Server.start(port = 8080, http = ExampleApp)
}
