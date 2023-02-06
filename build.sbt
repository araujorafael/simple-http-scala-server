scalaVersion := "3.2.1"
name := "simple-http-server"
version := "0.0.1"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.1",
  "io.d11"  %% "zhttp" % "2.0.0-RC10"
)
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerExposedPorts := Seq(8080)

dockerUsername := sys.props.get("docker.username")
dockerRepository := sys.props.get("docker.registry")
