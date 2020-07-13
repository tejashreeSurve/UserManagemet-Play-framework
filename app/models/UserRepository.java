package models;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import models.*;
import com.google.inject.ImplementedBy;


@ImplementedBy(JpaUserRepository.class)
public interface UserRepository {

	CompletionStage<User> addUser(User user);
	
	CompletionStage<Stream<User>> userList();
}
