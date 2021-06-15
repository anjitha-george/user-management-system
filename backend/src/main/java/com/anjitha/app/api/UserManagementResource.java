package com.anjitha.app.api;

import java.util.ArrayList;
import java.util.List;

import com.anjitha.app.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserManagementResource {

  private List<User> users = createUserList();

  @GetMapping( produces = "application/json")
  public List<User> users(){
    return users;
  }
  @DeleteMapping(path = "/{name}")
  public User deleteUser(@PathVariable("name") String name){
    User deletedUser = null;
    for(User user : users){
      if(user.getName().equals(name)){
        users.remove(user);
        deletedUser = user;
        break;
      }
    }
    return deletedUser;

  }
  @PostMapping
  public User create(@RequestBody User user) {
    users.add(user);
    return user;
  }

  public static List<User> createUserList(){
    List<User> userList = new ArrayList<>();
    User user1 = new User();
    user1.setName("John Mathew");
    user1.setAge(26);
    User user2 = new User();
    user2.setName("Joseph Thomas");
    user2.setAge(19);
    userList.add(user1);
    userList.add(user2);
    return userList;


  }
}
