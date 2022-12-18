package com.pts.Controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dangNhapController {
    @RequestMapping("auth/signin")
    public String dangnhap(Model m){
        return "/site/dangnhap";
    }
}
