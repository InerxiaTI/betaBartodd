package com.inerxiait.apirestdemo.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

    /**
     * @param model
     * @param request
     * @return
     */
    @GetMapping({"/", "/home", "/inicio"})
    public String index(Model model, HttpServletRequest request){
        String url = request.getRequestURL().substring(0, request.getRequestURL().indexOf("/", 9)+1);

        model.addAttribute("url",url);
        return "index";
    }

}
