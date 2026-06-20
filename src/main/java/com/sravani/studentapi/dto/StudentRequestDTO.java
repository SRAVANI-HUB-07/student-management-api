package com.sravani.studentapi.dto;
import jakarta.validation.constraints.NotBlank;


public class StudentRequestDTO {
    @NotBlank(message="Student name cannot be empty")
    private String name;

    public StudentRequestDTO()
    {

    }

    public StudentRequestDTO(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}
