package controllers;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.ResponseHandle;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserServices;
public class UserController extends Controller {
	
	private static final Logger logger = LoggerFactory.getLogger("controller");
//	// get all user
//	public Result getAllUser() {
//		Set<User> users = User.allUser();
//		return ok(Json.toJson(users));
//	}
FormFactory formFactory;

    public Result addUser() {
     //   JsonNode json =Json.toJson(badRequest().body().toString());
//        if (json == null) {
//            return badRequest(ResponseHandle.createResponse("Expecting JSON data", false));
//        }
//        logger.debug("In UserController.create(), input is: {}", json.toString());
//        User user = UserServices.getInstance().addUser(Json.fromJson(json, User.class));
//        JsonNode jsonObject = Json.toJson(user);
//        return created(ResponseHandle.createResponse(jsonObject, true));
  Form<User>  userform = formFactory.form(User.class);
  return ok(views.html.addUser.render(userform));
    	
      }
    
    public Result save() {
    return ok();	
    }


    public Result getAllUser() {
        Set<User> result = UserServices.getInstance().getAllUser();
        logger.debug("In UserController.listEmployees(), result is: {}",result.toString());
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
        return ok(ResponseHandle.createResponse(jsonData, true));

    }
    

}
