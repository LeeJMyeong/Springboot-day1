package com.example.demo.hobby;

import com.example.demo.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class Hobby {
    private Integer id;
    private String name;
    private Member member;

    public Hobby(Integer id, String name, Member member) {
        this.id = Store.hobbyIndes++;
        this.name = name;
        this.member = member;
    }
}
