package com.example.jenkins.mapper;

import com.example.jenkins.entity.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberDto> getMemberList();
}
