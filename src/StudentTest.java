import javax.swing.*;
import java.util.Random;

public class StudentTest {


    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);

    }
    //生成一个六位的随机数
    public static String getCode(){
        Random random = new Random();
        String code = "";
        for (int i = 0;i<6;i++){
            int rand = random.nextInt(10);
            code += rand;
        }
        return code;
    }
    //m每个手机号码每天只能发送三次，验证码放在redis中，设置过期时间
    public static void verifyCode(String phone,String code){
    }


}
