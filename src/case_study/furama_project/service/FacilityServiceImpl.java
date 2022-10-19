package case_study.furama_project.service;

import case_study.furama_project.models.Employee;
import case_study.furama_project.models.Facility;
import java.util.*;

public class FacilityServiceImpl implements FacilityService{
    static final LinkedHashMap <Integer, Facility> ListFacility = new LinkedHashMap <Integer, Facility>();
    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void show() {
        Collection<Facility> facility = ListFacility.values();
        for (Facility record: facility) {
            System.out.println(record);
        }
    }
}
