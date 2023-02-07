package config

import zhttp.http.Http
import zio.ZLayer
import zio.config._
import zio.config.magnolia.descriptor
import zio.config.typesafe.TypesafeConfigSource

object ExampleApp {
  def apply() = Http.empty
}

case class HttpServerConfig(host: String, port: Int)

// Uses the magnolia zio config derivation tool to fetch the app config setting
// With data creates a Layer with the configuration data to used as a object.
object HttpServerConfig {
  val layer: ZLayer[Any, ReadError[String], HttpServerConfig] =
    ZLayer {
      read {
        descriptor[HttpServerConfig].from(
          TypesafeConfigSource.fromResourcePath
            .at(PropertyTreePath.$("HttpServerConfig"))
        )
      }
    }
}
