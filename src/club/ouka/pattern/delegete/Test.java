package club.ouka.pattern.delegete;

import club.ouka.pattern.delegete.simple.Boss;
import club.ouka.pattern.delegete.simple.Leader;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 11:41
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("架构",new Leader());
        new Boss().command("加密",new Leader());
    }
}
