package controllers

import play.api.mvc._

/**
 * @author fred
 *         Date: 6/30/13
 *         Time: 9:45 PM
 */
object Main extends Controller{

    def index = Action {
        Ok(views.html.test("this is a message"))
    }

}
