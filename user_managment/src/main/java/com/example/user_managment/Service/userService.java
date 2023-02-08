package com.example.user_managment.Service;

import com.example.user_managment.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService {

    private static ArrayList<User> users=new ArrayList<>();

     private static int id=0;

    static{
        users.add(new User(++id,"Tanvir Pirjada","Tanvir007","Modasa,Gujarat","7594356473"));
        users.add(new User(++id,"rakesh Damor","rakheshOp","delhi,delhi","5748295332"));
        users.add(new User(++id,"sweety gupta","sweetu03","punjab,india","9364282793"));
        users.add(new User(++id,"Hetanshi Goswami","Het009","Mumbai,india","7468239878"));
        users.add(new User(++id,"Umang Rathod","Urrathod","Dehgham,Gujarat","2364882344"));

    }

    public static ArrayList<User> Getallusers(){
        return users;
    }

    public static User getbyname(String username){
        for(User use: users){
            if(use.getUsername().equals(username)){
                return use;
            }
        }
        return users.get(1);
    }

    public  void addUser(User user){
        users.add(user);
    }

    public void Updateuser(String name,User newuser){
        User user=getbyname(name);

        user.setUser_id(newuser.getUser_id());
        user.setName(newuser.getName());
        user.setUsername(newuser.getUsername());
        user.setAdress(newuser.getAdress());
        user.setPhonenumber(newuser.getPhonenumber());


    }


    public void deletbyid(Integer id){
        User newuser=users.get(1);
        for(User user: users){
            if(user.getUser_id()==id){
                newuser=user;
            }
        }
        users.remove(newuser);
    }
}
