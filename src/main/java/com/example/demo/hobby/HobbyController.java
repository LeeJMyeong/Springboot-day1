package com.example.demo.hobby;
import com.example.demo.member.Member;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/hobbies")
@AllArgsConstructor
public class HobbyController {
    private HobbyController hobbyService;

    @PostMapping("/members/{userId}/hobbies")
    public void addHobbyToMember(
            @PathVariable("userId") Integer userId,
            @RequestBody HobbyRequest hobbyRequest
    ) {
        // 가져와서 할당?
        hobbyService.addHobbyToMember(userId, hobbyRequest);
    }
}
