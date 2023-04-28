package com.example.jenkins.service;

import com.example.jenkins.entity.dto.MemberDto;

import java.util.List;

public interface MemberService {
     List<MemberDto> getMemberList();
}
