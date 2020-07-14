package models;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;

import play.db.jpa.JPAApi;
@Singleton
public class JpaUserRepository implements UserRepository {
	private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;
    
	@Inject
    public JpaUserRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

	@Override
	public CompletionStage<User> addUser(User user) {

		return CompletableFuture.supplyAsync( ()->wrap(entityManager->insert(entityManager,user)),executionContext);
	}

	@Override
	public CompletionStage<Stream<User>> userList() {
		// TODO Auto-generated method stub
		return CompletableFuture.supplyAsync( () -> wrap(entityManager -> userList(entityManager)), executionContext);
	}

	    private <T> T wrap(Function<EntityManager, T> function) {
	        return jpaApi.withTransaction(function);
	    }

	    private User insert(EntityManager entityManager, User user) {
	    	entityManager.persist(user);
	        return user;
	    }

	    private Stream<User> userList(EntityManager entityManager) {
	        List<User> user = entityManager.createQuery("select p from user p", User.class).getResultList();
	        return user.stream();
	    }
	
}
