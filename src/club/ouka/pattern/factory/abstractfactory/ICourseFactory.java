package club.ouka.pattern.factory.abstractfactory;

import club.ouka.pattern.factory.ICourse;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 17:12
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
