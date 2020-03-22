package club.ouka.pattern.factory.simplefactory;

import club.ouka.pattern.factory.Acourse;
import club.ouka.pattern.factory.ICourse;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 16:02
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICourse a = CourseFactory.create("A");
        ICourse course = CourseFactory.course(Acourse.class);
        course.courseName();
        a.courseName();
    }
}
