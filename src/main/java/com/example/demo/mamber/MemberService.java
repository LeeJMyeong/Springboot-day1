package com.example.demo.mamber;


import com.example.demo.store.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public List<Member> findAll() {
        return Store.members;
    }

    public Member findById(Integer id) {
        for (int i = 0; i < Store.members.size(); i++) {
            if (Store.members.get(i).getId() == id)
                return Store.members.get(i);
        }
        return null;
    }

    public void save(Member member) {
        Store.members.add(member);
    }

    //    public void delete(String name) {
//        Store.members.removeIf(member -> member.getName().equals(name));
//    }
//
//    public void update(String name, Member updatedMember) {
//        List<Member> members = Store.members;
//        for (int i = 0; i < members.size(); i++) {
//            if (members.get(i).getName().equals(name)) {
//                members.set(i, updatedMember);
//                break;
//            }
//        }
//    }
    public void deleteId(Integer id) {
//    Store.members.stream()
//            .filter(u -> !u.getId().equals(id))
//            .toList();
        for (int i = 0; i < Store.members.size(); i++) {
            if (id == Store.members.get(i).getId()) {
                Store.members.remove(i);
            }
        }
        //  Store.members.remove(findById(id));
    }

    public Member update(Integer id, MemberRequest member) {
//    for (int i = 0;i < Store.members.size();i++){
//        if(id == Store.members.get(i).getId()){
//            Store.members.get(i).setName(member.name());
//            Store.members.get(i).setAge(member.age());
//        }
//    }
        Member byId = findById(id);
        byId.setAge(member.age());
        byId.setName(member.name());
        return byId;
    }
}
