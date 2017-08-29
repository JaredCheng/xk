package test;

import model.Cccourse;
import service.CccourseService;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        CccourseService cccourseService = new CccourseService();
        ArrayList<Cccourse> cccourses = (ArrayList<Cccourse>) cccourseService.query();
        System.out.println(cccourses);
    }
}
