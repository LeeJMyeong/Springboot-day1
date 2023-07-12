package com.example.demo.member;

import com.example.demo.hobby.Hobby;

import java.util.List;

public class MemberResponse {
    private Integer id;
    private String name;
    private int age;
    private List<Hobby> hobbies;

    public MemberResponse(Integer id, String name, int age, List<Hobby> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
}
