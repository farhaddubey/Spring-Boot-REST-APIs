package com.example.SpringBootRestAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {
    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 30, message = "Name should be of length 3 to 30 characters.")
    private String name;

    @Email
    @NotBlank(message = "Email is required")
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
