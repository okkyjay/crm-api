package crm.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addUser(UserModel user) {
        userRepository.save(user);
    }

    public UserModel getUser(int id){
        return userRepository.findById(id).get();
    }
    public void updateUser(int id, UserModel user){
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
