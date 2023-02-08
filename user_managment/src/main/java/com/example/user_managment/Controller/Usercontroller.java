package com.example.user_managment.Controller;

import com.example.user_managment.Model.User;
import com.example.user_managment.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Usercontroller {

    @Autowired
   private userService userservice;

    @GetMapping("getAllUsers")
    public ArrayList<User> getallusers(){
        return  userservice.Getallusers();
    }

    @GetMapping("/getByname/username/{username}")
    public  User getbyname(@PathVariable String username){
        return userservice.getbyname(username);
    }

    @PostMapping("Adduser")
    public void Adduser(@RequestBody User user){
          userservice.addUser(user);
    }

    @PutMapping("Updateuser/name/{name}")
    public void Updatebyname(@PathVariable String name , @RequestBody User user){
     userservice.Updateuser(name, user);
    }

   @DeleteMapping("Dletebyid/id/{id}")
    public void deletebyid(@PathVariable Integer id){
        userservice.deletbyid(id);
   }


}
