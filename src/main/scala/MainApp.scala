import zio._

object MainApp extends ZIOAppDefault {
  def run =
    for {
      name <- Console.readLine("What is your name?")
      _ <- Console.printLine(s"Hello, $name")
    } yield ()
}
