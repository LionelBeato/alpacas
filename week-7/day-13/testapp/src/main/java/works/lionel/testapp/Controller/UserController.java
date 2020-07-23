package works.lionel.testapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import works.lionel.testapp.Model.User;
import works.lionel.testapp.Service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;


    //get
    // this could be described as an "endpoint"
    // this describes a location that you can reach that will provide some sort of resource or access to resource methods
    @GetMapping("/view")
    public ModelAndView viewUsers(){
        Iterable<User> users = userService.getUsers();
        Map<String, Object> params = new HashMap<>();
        params.put("users", users);
        return new ModelAndView("users", params);
    }

    //create
    @PostMapping("/post")
    public String postUser (@RequestBody User user){
        userService.postUser(user);
        return "sucess!, that worked!";
    }


    //update

    //delete

    @DeleteMapping("/delete/{id}")
    public RedirectView deleteUserRedirect(@PathVariable Long id){
        userService.deleteUser(id);
        return localRedirect();
    }

    @PostMapping("/update/{id}")
    public RedirectView updateUserRedirect(@PathVariable Long id, @RequestBody User newUser){
        userService.updateUser(newUser, id);
        return localRedirect();
    }

    @RequestMapping("/a")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/users/view");
        return redirectView;
    }


}

