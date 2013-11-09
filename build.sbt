name := "scctSample"

description := "SCCT sample application based on Play framework."

organization := "org.scct"

organizationHomepage := Some(url("https://github.com/SCCT"))

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/SCCT/scctSample"))

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq()

play.Project.playScalaSettings ++ seq(ScctPlugin.instrumentSettings : _*)

ScctPlugin.scctExcludePackages in ScctPlugin.ScctTest := "Reverse*,views.html"

scalacOptions ++= Seq("-encoding", "UTF-8", "-unchecked", "-deprecation", "-Xcheckinit", "-Xfatal-warnings")

// http://vanillajava.blogspot.ru/2012/02/using-java-7-to-target-much-older-jvms.html
javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation", "-source", "1.6", "-target", "1.6")

javacOptions in doc := Seq("-source", "1.6")
