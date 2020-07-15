package controllers;

import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.ResponseHandle;
import models.User;
import models.UserRepository;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.UserServices;
import static play.libs.Json.toJson;
@Transactional
public class UserController extends Controller {

	private static final Logger logger = LoggerFactory.getLogger("controller");

	private final  FormFactory formFactory;


	private final UserRepository userRepository;
	private final HttpExecutionContext executionContext;

	@Inject
	public UserController(FormFactory formFactory, UserRepository userRepository,
			HttpExecutionContext executionContext) {
		this.formFactory = formFactory;
		this.userRepository = userRepository;
		this.executionContext = executionContext;
	}

	public Result addUser() {
		Form<User> userform = formFactory.form(User.class);
		return ok(views.html.addUser.render(userform));
	}

	public CompletionStage<Result> save(Http.Request request) {
		User user = formFactory.form(User.class).bindFromRequest(request).get();
		return userRepository.addUser(user).thenApplyAsync(p -> redirect(routes.UserController.addUser()),
				executionContext.current());
	}

	public CompletionStage<Result> getUser() {
		return userRepository.userList().thenApplyAsync(
				userStream -> ok(toJson(userStream.collect(Collectors.toList()))), executionContext.current());
	}

}
