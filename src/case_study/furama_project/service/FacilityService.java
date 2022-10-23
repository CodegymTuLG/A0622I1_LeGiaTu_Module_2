package case_study.furama_project.service;

import case_study.furama_project.models.House;
import case_study.furama_project.models.Room;
import case_study.furama_project.models.Villa;

import java.util.Scanner;

public interface FacilityService extends Service {
    void addNewHouse();

    void addNewVilla();

    void addNewRoom();
}
