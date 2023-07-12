package com.example.demo.hobby;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class HobbyRequest {
    private String name;

    public HobbyRequest(String name) {
        this.name = name;
    }
}
