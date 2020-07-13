package models;

import akka.actor.ActorSystem;
import play.api.libs.concurrent.CustomExecutionContext;

public class DatabaseExecutionContext extends CustomExecutionContext{

	public DatabaseExecutionContext(ActorSystem system) {
		super(system, "database.dispatcher");
		// TODO Auto-generated constructor stub
	}

}
