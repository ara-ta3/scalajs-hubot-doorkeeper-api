package dark

import dark.util.HttpClientImplWithXhrObject

import scala.scalajs.js.JSApp

object HubotScript extends JSApp {

  def main():Unit = {
    val cli = new HttpClientImplWithXhrObject()
    println(cli.get("http://api.doorkeeper.jp/events", (src:String) => println(src)))
  }
}
