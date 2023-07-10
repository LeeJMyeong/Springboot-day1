package com.example.demo.mamber;

import com.example.demo.store.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor @NoArgsConstructor
public class Member {
    private Integer id;
    private String name;
    private Integer age;

    public Member(String name, Integer age){
        this.id = Store.members.size();
        this.name = name;
        this.age = age;
    }
}
