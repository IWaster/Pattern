package club.ouka.pattern.delegete.simple;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 11:44
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工b,擅长架构");
    }
}
