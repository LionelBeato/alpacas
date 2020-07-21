package works.lionel.testapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import works.lionel.testapp.Model.User;
import works.lionel.testapp.Repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    // get
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    // post
    public void postUser(User user){
        userRepository.save(user);
    }

    // update
    public Optional<User> updateUser(User newUser, Long id){
        // take note that "map" is a higher order function!
        // this allows us to change our data is a neater more concise fashion.
        // this is an example of functional programming
        userRepository.findById(id).map(user -> {
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());
            user.setEmail(newUser.getEmail());
            user.setType(newUser.getType());
            return userRepository.save(user);
        });
        return userRepository.findById(id);
    }

    // delete
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
