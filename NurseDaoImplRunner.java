package com.xworkz.hospital.runner;

import com.xworkz.hospital.dao.NurseDao;
import com.xworkz.hospital.dao.NurseDaoImpl;
import com.xworkz.hospital.dto.NurseDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NurseDaoImplRunner {
    public static void main(String[] args) {
        NurseDao nurseDao=new NurseDaoImpl();
/*
        NurseDto nurse=new NurseDto();
        nurse.setId(0);
        nurse.setName("Vasudha");
        nurse.setYeaOfExperience(24);
        nurse.setAssignedTo("Dr. Dinesh Kumar G R");
        nurse.setShift("Morning");
        System.out.println("Number of rows inserted: "+nurseDao.addNurse(nurse));

        NurseDto nurse1=new NurseDto(0,"Shashidhar",17,"Dr Vinod Kumar K","Night");
        System.out.println("Number of rows inserted: "+nurseDao.addNurse(nurse1));

        int row=nurseDao.addNurse("Gowri", 20,"Dr. Dinesh Kumar G R", "Night");
        System.out.println("Number of rows inserted: "+row);
        nurseDao.getNurse();
        */
        nurseDao.find("select * from Nurses");
        nurseDao.find("select * from Nurses where id=4");
        nurseDao.find("select * from Nurses where shift='night'");
        nurseDao.find("select * from Nurses where assignedTo='Dr. Dinesh Kumar G R'");
        nurseDao.find("select * from Nurses where yearOfExperience>20");
    }
}
