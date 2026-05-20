package com.example.SpringBootRestAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    private String name;
    private String email;

//    public AddStudentRequestDto(String name, Sring email) {
//        this.name = name;
//        this.email = email;
//    }

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

}
