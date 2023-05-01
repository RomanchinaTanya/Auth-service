ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val auth = (project in file("."))
  .settings(
    name := "project-auth",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.13",
      "dev.zio" %% "zio-http" % "0.0.5",
      "com.github.pureconfig" %% "pureconfig" % "0.17.3"
    )
  )
