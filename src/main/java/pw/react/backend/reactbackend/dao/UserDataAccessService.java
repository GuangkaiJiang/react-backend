package pw.react.backend.reactbackend.dao;
import org.springframework.stereotype.Repository;
import pw.react.backend.reactbackend.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("myDao")
public class UserDataAccessService implements UserDao {
    private static List<User> DB=new ArrayList<>();
    @Override
    public int insertUser(UUID id,User user) {
        DB.add(new User(id,user.getFirstName(),user.getLastName()));
        return 1;
    }
}
