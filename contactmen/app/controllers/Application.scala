package controllers

import play.api.mvc._
import play.api.db.DB
import play.api.Play.current
import anorm._

object Application extends Controller {
  
  def index = Action {
    DB.withConnection{implicit c=>
        val result = SQL("select * from people")().map(row => row[Int]("id") -> row[String]("name")).toList;
        Ok(views.html.index(result(0)._2));
    }

  }

}