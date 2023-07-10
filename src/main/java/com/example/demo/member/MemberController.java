package com.example.demo.member;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/members")
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;
    @GetMapping
    public List<Member> findAll(){
        return memberService.findAll();
    }
    @GetMapping("{id}")
    public Member findById(@PathVariable("id") Integer id){
        return memberService.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MemberRequest member) {
        memberService.save(member.toEntity());
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Integer id){
        memberService.delete(id);
    }
    @PutMapping("{id}")
    public Member update(@PathVariable("id")Integer id,
                         @RequestBody MemberRequest memberRequest){
        return memberService.update(id, memberRequest);
    }
}