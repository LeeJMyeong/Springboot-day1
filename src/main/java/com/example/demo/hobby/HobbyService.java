package com.example.demo.hobby;
import com.example.demo.member.Member;
import com.example.demo.member.MemberController;
import com.example.demo.store.Store;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HobbyService {
    private final List<Hobby> hobbies = new ArrayList<>();
    private MemberController memberService;

    public void addHobbyToMember(Integer userId, HobbyRequest hobbyRequest) {
        // userId에 해당하는 사용자를 조회
        Member member = memberService.findById(userId);
        Hobby hobby = new Hobby(hobbyRequest.getName(), member);
        member.addHobby(hobby);
    }

}
