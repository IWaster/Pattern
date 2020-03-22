package club.ouka.pattern.delegete.simple;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 11:41
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.work(command);
    }
}
