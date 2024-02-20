ThisBuild / scalaVersion := "3.3.1"

lazy val versions = new {
  val cats = "2.10.0"
}

libraryDependencies += "org.typelevel" %% "cats-core" % versions.cats
