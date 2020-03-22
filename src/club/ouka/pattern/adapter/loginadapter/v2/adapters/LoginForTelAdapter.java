package club.ouka.pattern.adapter.loginadapter.v2.adapters;


import club.ouka.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by ouka.
 */
public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
