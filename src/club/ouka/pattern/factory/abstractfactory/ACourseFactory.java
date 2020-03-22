package club.ouka.pattern.factory.abstractfactory;

import club.ouka.pattern.factory.Acourse;
import club.ouka.pattern.factory.ICourse;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-05
 * Time: 16:23
 */
public class ACourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new Acourse();
    }

    @Override
    public INote createNote() {
        return new ANote();
    }

    @Override
    public IVideo createVideo() {
        return new AVideo();
    }
}
