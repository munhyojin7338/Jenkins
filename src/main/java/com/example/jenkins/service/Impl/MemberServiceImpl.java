package com.example.jenkins.service.Impl;

import com.example.jenkins.mapper.MemberMapper;
import com.example.jenkins.entity.dto.MemberDto;
import com.example.jenkins.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    @Override
    public List<MemberDto> getMemberList() {
        return memberMapper.getMemberList();
    }
}
