organization := "com.test"

name := "markdown_viewer"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.0"

seq(webSettings :_*)

libraryDependencies ++= {
  val liftVersion = "2.5.1"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
    "com.tristanhunt" %% "knockoff" % "0.8.1",
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910"  %
      "container,test",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" %
      "container,compile" artifacts Artifact("javax.servlet", "jar", "jar")
  )
}
