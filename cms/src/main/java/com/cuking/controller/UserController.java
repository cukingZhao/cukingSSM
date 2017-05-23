package com.cuking.controller;

import com.cuking.controller.common.BaseController;
import com.cuking.controller.common.ResponseVo;
import com.cuking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cuking on 2017/5/22.
 */

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{


    @Autowired
    UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public ResponseVo register(String userName, String password){
        userService.save(userName,password);
        return ResponseVo.SUCCESS();
    }


}
