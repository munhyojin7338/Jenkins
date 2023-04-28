package com.example.jenkins.controller;


import com.example.jenkins.entity.dto.MemberDto;
import com.example.jenkins.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/user")
    public List<MemberDto> getMember() {
        return memberService.getMemberList();
    }
}
