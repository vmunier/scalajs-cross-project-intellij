import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}

object Main extends js.JSApp {
  def main() = {
    g.document.body.innerHTML = SharedTags.body.render
  }
}
