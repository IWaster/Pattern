package club.ouka.pattern.adapter.loginadapter.v1;


import club.ouka.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * Created by ouka.
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("ouka","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
