package com.example.vueadminbackend.Controller;

import com.example.vueadminbackend.Entity.User;
import org.springframework.web.bind.annotation.*;
import com.example.vueadminbackend.utils.*;
import com.example.vueadminbackend.utils.Result;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        String token = JwtUtils.generateToken(user.getUsername());
        return Result.ok().data("token",token);
    }
    @GetMapping("/info")
    public Result info(String token){
        String username=JwtUtils.decodeToken(token).getSubject();
        String url="https://i.pinimg.com/564x/ee/00/20/ee0020e9d7586708083aecdb77be6293.jpg";
        return Result.ok().data("name",username).data("avatar",url);
    }

    @PostMapping("/logout")
    public Result logout(){return Result.ok();}
}