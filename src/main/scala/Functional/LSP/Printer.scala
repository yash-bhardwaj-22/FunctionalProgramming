package Functional.LSP

case class Printer(message: String) {
  def printMessage = println(message)
}