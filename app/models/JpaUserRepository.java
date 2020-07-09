package models;
 
import javax.inject.*;
import java.util.concurrent.*;

public class JpaUserRepository {
	 private JPAApi jpaApi;
	  private DatabaseExecutionContext executionContext;

	  @Inject
	  public JPARepository(JPAApi api, DatabaseExecutionContext executionContext) {
	    this.jpaApi = api;
	    this.executionContext = executionContext;
	  }
}
