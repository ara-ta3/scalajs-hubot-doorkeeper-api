package dark.util

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalajs.dom.raw.Event


trait HttpClient {
  def get(u:String): String
}

class HttpClientImplWithXhrObject {
  import HttpClientImplWithXhrObject._

  def get(u:String, callback:String => Unit): Unit = {
    val xhr = new XMLHttpRequest()
    xhr.open("GET", u, async = true)
    xhr.onload = (event:Event) => {
      if(xhr.readyState == readyStateComplete && xhr.status == statusCodeSuccess) {
        callback(xhr.responseText)
      } else {
        // TODO Eitherで返す
        callback(xhr.statusText)
      }
    }
    xhr.send(null)
  }
}

object HttpClientImplWithXhrObject {
  private val readyStateComplete = 4

  private val statusCodeSuccess = 200
}
