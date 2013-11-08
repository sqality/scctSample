name := "scctSample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq()     

play.Project.playScalaSettings

ScctPlugin.instrumentSettings

ScctPlugin.scctExcludePackages in ScctPlugin.ScctTest := "Reverse*,views.html"
