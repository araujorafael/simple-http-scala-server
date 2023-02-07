import zio._
import zhttp.service.Server
import example_app.ExampleApp
import _root_.config.HttpServerConfig

object MainApp extends ZIOAppDefault {

  def run = ZIO.service[HttpServerConfig].flatMap { config =>
      Server.start(
        port = config.port,
        http = ExampleApp()
      )}
    .provide(
      HttpServerConfig.layer
    )
}
