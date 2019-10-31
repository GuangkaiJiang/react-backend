package pw.react.backend.reactbackend.Repo;


import org.springframework.data.repository.CrudRepository;
import pw.react.backend.reactbackend.entity.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findByLastName(String lastName);
	User findByLogin(String login);
}
