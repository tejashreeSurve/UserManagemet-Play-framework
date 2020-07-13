package models;

import javax.inject.Inject;

import akka.actor.ActorSystem;
import play.api.libs.concurrent.CustomExecutionContext;

public class DatabaseExecutionContext extends CustomExecutionContext {
	@Inject
	public DatabaseExecutionContext(ActorSystem system) {
		super(system, "database.dispatcher");
		// TODO Auto-generated constructor stub
	}

}
