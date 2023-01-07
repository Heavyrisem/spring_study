package com.example.demo.controller;

import com.example.demo.dto.LoginRequestDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    String login(@Validated LoginRequestDto loginRequestDto, HttpServletRequest request) {
        // .... // 사용자 패스워드 검증 (패스워드 암호화는 선택)

        HttpSession session = request.getSession(); // 세션 발급
        session.setAttribute("name", loginRequestDto.getName()); // 세션에 현재 인증된 사용자 저장

        return "redirect:/home"; // home 페이지로 리다이렉트
    }


    // 사용자 회원가입 기능 추가
//    @PostMapping("/register")
//    String register() { // 회원가입 정보 입력 받기
//    // ... 사용자 중복 체크 후, 회원가입 진행 (DB에 회원 정보 생성)
//    // login 페이지로 리다이렉트
//    }
}
