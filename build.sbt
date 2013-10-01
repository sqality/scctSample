import sbt.scct.ScctPlugin

name := "scctSample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

seq(ScctPlugin.instrumentSettings : _*)