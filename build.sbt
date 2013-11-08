name := "scctSample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq()     

play.Project.playScalaSettings ++ seq(ScctPlugin.instrumentSettings : _*)

ScctPlugin.scctExcludePackages in ScctPlugin.ScctTest := "Reverse*,views.html"
