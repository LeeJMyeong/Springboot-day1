package com.example.demo.member;
import com.example.demo.store.Store;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class MemberService {
    private static final List<Member> members = new ArrayList<>();
    public List<Member> findAll(){
        return members;
    }
    public Member findById(Integer id) {
        for (int i = 0; i < Store.members.size(); i++) {
            if (Store.members.get(i).getId() == id) {
                return Store.members.get(id);
            }
        }
        return null;
    }
    public void save(Member member) {
        members.add(member);
    }
    public void delete(Integer id) {
        Store.members.remove(findById(id));
    }
    public Member update(Integer id, MemberRequest memberRequest) {
        Member newMem = findById(id);
        newMem.setAge(memberRequest.age());
        newMem.setName(memberRequest.name());
        return newMem;
    }
}