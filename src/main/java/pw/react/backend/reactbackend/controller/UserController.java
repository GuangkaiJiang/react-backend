package pw.react.backend.reactbackend.controller;

import java.sql.Date;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pw.react.backend.reactbackend.Repo.UserRepository;
import pw.react.backend.reactbackend.entity.User;


@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @RequestMapping("/save")
    public String process(){
        // save a single User
        repository.save(new User("Jack", "Smith","js",Date.valueOf("1997-11-30") ,true));

        // save a list of Users
        repository.save(new User("Adam", "Johnson","aj", Date.valueOf("1996-10-29"),true));
        repository.save(new User("Kim", "Smith","ks", Date.valueOf("1995-9-28"),true));
        repository.save(new User("David", "Williams","dw", Date.valueOf("1994-8-27"),true));
        repository.save(new User("Peter", "Davis","pd", Date.valueOf("1993-07-26"),true));

        return "Done";
    }


    @RequestMapping("/findall")
    public String findAll(){
        String result = "";

        for(User u : repository.findAll()){
            result += u.toString() + "<br>";
        }

        return result;
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findById(id).toString();
        return result;
    }

    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
        String result = "";

        for(User u: repository.findByLastName(lastName)){
            result += u.toString() + "<br>";
        }

        return result;
    }
    @RequestMapping("/findbylogin")
    public String fetchDataByLogin(@RequestParam("login") String login){
        String result = "";
        result += repository.findByLogin(login).toString() + "<br>";
        return result;
    }
    @RequestMapping("/add")
    public void addUser(@RequestBody User user)
    {
        repository.save(new User(user.getFirstName(),user.getLastName(),user.getLogin(), user.getDoB(),user.getisActive()));
    }

}

