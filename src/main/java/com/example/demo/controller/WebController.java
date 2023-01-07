package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class WebController {
    @RequestMapping("/home")
    ModelAndView getHomePage(HttpServletRequest request) {
        HttpSession session = request.getSession();

        // 사용자가 로그인되어 있지 않다면, /login 페이지로 리다이렉트
        // ModelAndView 리다이렉트 방법 찾아보기

        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject("name", session.getAttribute("name"));
        return modelAndView;
    }

    @RequestMapping("/login")
    ModelAndView getLoginPage() {
        ModelAndView modelAndView = new ModelAndView("login.html");
        return modelAndView;
    }

    @RequestMapping("/register")
    ModelAndView getRegisterPage() {
        ModelAndView modelAndView = new ModelAndView("register");
        return modelAndView;
    }
}
