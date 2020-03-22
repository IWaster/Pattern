package club.ouka.pattern.factory.factorymethod;

import club.ouka.pattern.factory.ICourse;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 16:02
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new ACourseFactory();
        ICourse course = iCourseFactory.course();
        course.courseName();
    }
}
