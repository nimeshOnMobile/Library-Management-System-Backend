package com.example.library_management_system.controller;

import com.example.library_management_system.model.Member;
import com.example.library_management_system.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers(){
        return memberService.findAllMembers();
    }

    @PostMapping
    public Member addMember(@RequestBody Member member){
        return memberService.saveMember(member);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<?> deleteMember(@PathVariable Long memberId){
        memberService.deleteMember(memberId);
        return ResponseEntity.ok().build();
    }
}
