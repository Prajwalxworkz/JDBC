package com.xworkz.hospital.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NurseDto {
    private int id;
    private String name;
    private int yeaOfExperience;
    private String assignedTo;
    private String shift;
}
