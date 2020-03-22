package club.ouka.pattern.factory.simplefactory;

import club.ouka.pattern.factory.Acourse;
import club.ouka.pattern.factory.Bcourse;
import club.ouka.pattern.factory.ICourse;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 16:02
 */
public class CourseFactory {
    public static ICourse create(String courseName) {
        switch (courseName) {
            case "A":
                return new Acourse();
            case "B":
                return new Bcourse();
            default:
                return null;
        }
    }

    public static ICourse course(Class clazz) {


        try {
            if (clazz != null) {

                return (ICourse) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
