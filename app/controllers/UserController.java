package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {

	// get all user
	public Result getAllUser() {
		return ok(views.html.index.render());
	}

	// add new user
	public Result addUser() {
		return ok(views.html.index.render());
	}

	// edit user
	public Result editUser(Integer userId) {
		return ok(views.html.index.render());
	}

	// update user
	public Result updateUser() {
		return ok(views.html.index.render());
	}

}
