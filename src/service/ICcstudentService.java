package service;

import model.Ccstudent;

public interface ICcstudentService {
    int add(Ccstudent ccstudent);

    boolean login(Ccstudent ccstudent);
}
