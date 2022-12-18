package com.pts.Controller.site;

import com.pts.DAO.ContentDAO;
import com.pts.Service.AccountService;
import com.pts.Service.CategoryService;
import com.pts.Service.CourseService;

import com.pts.entity.Content;
import com.pts.entity.Course;
import com.pts.entity.NoiDungKH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Controller
public class homeController {
    @Autowired
    AccountService accountService;
    @Autowired
    CourseService courseService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ContentDAO contentDAO;

    @RequestMapping("")
    public String index(Model m){
        List<Course> courses=courseService.findAll().stream()
                .filter(course -> course.getTps_Price()<=0).collect(Collectors.toList());
        m.addAttribute("listKHF",courses);
        return "/site/index";
    }
//    trang chi tiết
    @RequestMapping("/khoa-hoc/{tps_id}")
    public String trangchitiet(Model m, @PathVariable("tps_id") int id) throws FileNotFoundException {
        Course course =courseService.findById(id);
//            String url="P:\\Code_QuanTrong\\Code_Khoa_Hoc\\backend\\TP_Store\\src\\main\\resources\\static\\noidung\\"+id +".txt";
//            // Đọc dữ liệu từ File với Scanner
//            FileInputStream fileInputStream = new FileInputStream(url);
//            Scanner scanner = new Scanner(fileInputStream);
//            List<NoiDungKH>noiDungKH=new ArrayList<>();
//            for(NoiDungKH list :noiDungKH){
//                System.out.println(scanner.hasNextLine());
//                m.addAttribute("id1",list);
//            }
        m.addAttribute("detail",course);


        return "/site/details";
    }


//    @RequestMapping("/khoa-hoc")
//    public String chitiet(){
//        return "/site/details";
//
//    }
}
