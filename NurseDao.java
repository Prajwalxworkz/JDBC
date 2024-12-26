package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.NurseDto;

import java.sql.ResultSet;

public interface NurseDao {
    int addNurse(NurseDto nurseDto);
    int addNurse(String name, int yearOfExperience, String assignedTo, String shift);
    void getNurse();
    void find(String sql);
}
