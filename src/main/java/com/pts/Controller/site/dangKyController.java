package com.pts.Controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dangKyController {
    @RequestMapping("auth/signup")
    public String signup(Model m){

        return "site/dangky";
    }
}
