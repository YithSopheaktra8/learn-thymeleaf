package org.yithsopheaktra.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private String role;
    private String gender;
}
