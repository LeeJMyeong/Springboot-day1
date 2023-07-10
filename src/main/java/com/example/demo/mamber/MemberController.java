package com.example.demo.mamber;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

//    @Autowired 오토와이어를 써도되고 생성자를 만들어줘도 된다.
    private final MemberService memberService;

    @GetMapping
    public List<Member> findAll(){
        return null;
    }
    @GetMapping("{id}")
    public Member findById(@PathVariable("id")Integer id){
       return memberService.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MemberRequest member){
        memberService.save(member.toEntity());

    }
//    @DeleteMapping("{name}")
//    public void delete(@PathVariable("name") String name) {
//        memberService.delete(name);
//    }
//
//    @PutMapping("{name}")
//    public void update(
//            @PathVariable("name") String name,
//            @RequestBody MemberRequest updatedMember
//    ) {
//        memberService.update(name, updatedMember.toEntity());
//    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id")) Integer id

}
