package crm.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/users")
    public List<UserModel> getAllTopics(){
        return userService.getAllUsers();
    }
    @RequestMapping("/users/{id}")
    public UserModel getTopic(@PathVariable int id){
        return userService.getUser(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/users")
    public void addTopic (@RequestBody UserModel userModel) {
        userService.addUser(userModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody UserModel userModel, @PathVariable int id){
        userService.updateUser(id, userModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
}
