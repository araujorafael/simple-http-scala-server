package example_app

import zhttp.http._

val UrlShortner: Http[Any, Nothing, Request, Response] =
  Http.collect[Request] {
    case Method.GET -> !! / "url"  =>
      Response.text("Nova url!?")
  }
