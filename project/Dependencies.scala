import sbt._
object Dependencies {

  object Smithy {
    val version = "1.74.1"
    val build   = "software.amazon.smithy" % "smithy-build" % version
  }
}
