package com.example.library_management_system.service;

import com.example.library_management_system.model.Member;
import com.example.library_management_system.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findAllMembers(){
        return memberRepository.findAll();
    }

    public Member saveMember(Member member){
        return memberRepository.save(member);
    }

    public void deleteMember(Long memberId){
        memberRepository.deleteById(memberId);
    }
}
