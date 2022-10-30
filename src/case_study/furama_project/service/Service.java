package case_study.furama_project.service;

import java.io.IOException;

public interface Service {
    void add() throws IOException;
    void edit() throws IOException;
    void delete();
    void show();
}
