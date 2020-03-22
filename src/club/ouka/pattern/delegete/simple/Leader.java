package club.ouka.pattern.delegete.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 11:42
 */
public class Leader {

    private Map<String,IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("加密",new EmployeeA());
        register.put("架构",new EmployeeB());
    }

    public void work(String command){register.get(command).doing(command);}
}
