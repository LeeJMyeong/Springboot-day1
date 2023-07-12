package com.example.demo.member;

import com.example.demo.hobby.Hobby;
import com.example.demo.store.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private List<Hobby> hobbies;

    public Member(String name, Integer age){
        this.id = Store.memberIndex++;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + (hobbies != null ? hobbies.size() : 0) +  // 상호 참조 필드를 toString()에서 사용하지 않음
                '}';
    }

    public void addHobby(Hobby hobby) {
        if (hobbies == null) {
            hobbies = new ArrayList<>();
        }
        hobbies.add(hobby);
    }

}
