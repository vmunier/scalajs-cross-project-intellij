import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}

object Main extends js.JSApp {
  def main() = {
    if (!js.isUndefined(g.document)) {
      g.document.body.innerHTML = SharedTags.body.render
    } else {
      println(SharedTags.body)
    }
  }
}
