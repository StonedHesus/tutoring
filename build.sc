import mill._
import $ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object tutoring extends PlayModule with SingleModule {

  def scalaVersion = "3.3.3"
  def playVersion = "3.0.4"
  def twirlVersion = "2.0.1"

  object test extends PlayTests
}
