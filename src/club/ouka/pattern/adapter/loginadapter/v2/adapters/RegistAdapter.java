package club.ouka.pattern.adapter.loginadapter.v2.adapters;


import club.ouka.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by ouka.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
