package com.example.demo.mamber;
public record MemberRequest(String name, Integer age) {
    public Member toEntity(){
        return new Member(name, age);
    }
}
