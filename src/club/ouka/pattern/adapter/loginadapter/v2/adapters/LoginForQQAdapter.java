package club.ouka.pattern.adapter.loginadapter.v2.adapters;


import club.ouka.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by ouka.
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
