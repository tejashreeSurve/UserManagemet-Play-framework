package controllers;

import java.util.Set;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
public class UserController extends Controller {

	// get all user
	public Result getAllUser() {
		Set<User> users = User.allUser();
		String message = "helolo";
	//	return ok(Json.toJson(users));
		return ok(views.html.index.render(message));
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
