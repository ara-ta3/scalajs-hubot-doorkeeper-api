
import scala.scalajs.js
import js.annotation._

package importedjs {

package `node-slack` {

@JSName("node-slack.Slack")
class Slack protected () extends js.Object {
  def this(hookUrl: String, option: Slack.Option = ???) = this()
  def send(message: Slack.Message): js.Dynamic = js.native
  def send(message: Slack.Message, callback: Slack.SendCallback): request.Request = js.native
  def respond(query: Slack.Query): Slack.TextResponse = js.native
  def respond(query: Slack.Query, callback: Slack.ResponseCallback): Slack.TextResponse = js.native
}

trait Option extends js.Object {
  var proxy: String = js.native
}

trait Message extends js.Object {
  var text: String = js.native
  var channel: String = js.native
  var username: String = js.native
  var icon_emoji: String = js.native
  var attachments: js.Array[js.Any] = js.native
  var unfurl_links: Boolean = js.native
  var link_names: Double = js.native
}

trait SendCallback extends js.Object {
  def apply(err: js.Any, body: js.Any): js.Dynamic = js.native
}

trait Query extends js.Object {
  var token: String = js.native
  var team_id: String = js.native
  var channel_id: String = js.native
  var channel_name: String = js.native
  var timestamp: Double = js.native
  var user_id: String = js.native
  var user_name: String = js.native
  var text: String = js.native
}

trait TextResponse extends js.Object {
  var text: String = js.native
}

trait ResponseCallback extends js.Object {
  def apply(err: js.Any, query: Query): js.Dynamic = js.native
}

}

}
