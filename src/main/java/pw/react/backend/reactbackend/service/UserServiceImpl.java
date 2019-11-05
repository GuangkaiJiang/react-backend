package pw.react.backend.reactbackend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pw.react.backend.reactbackend.entity.User;
import pw.react.backend.reactbackend.repo.UserRepository;


import java.util.Optional;

@Service
class UserServiceImpl implements UserService {

    UserRepository repository;

    @Autowired
    UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public ResponseEntity<String> checkUserByLogin(String login) {

        if (repository.findByLogin(login)!=null) {

            return ResponseEntity.ok().body("User with given login exists");
        }
        return ResponseEntity.ok().body("User with given login do not exist");
    }
}
