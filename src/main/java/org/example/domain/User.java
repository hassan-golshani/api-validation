package org.example.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private Integer age;
}
