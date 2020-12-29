package my.example.io

import scala.io.Source
import scala.util.Using

class MyExample {

  def readFileIntoString(filename: String) =
    Source.fromFile(filename).getLines().mkString("\n")

  def readFileIntoString2(filename: String) = Using(Source.fromFile(filename)) {
    src => src.getLines().mkString("\n")
  }

  def readFileIntoString3(filename: String) = Using(Source.fromFile(filename)) {
    _.getLines().mkString("\n")
  }

}
