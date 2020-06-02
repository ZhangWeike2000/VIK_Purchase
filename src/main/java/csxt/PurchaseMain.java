package csxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启事务
@SpringBootApplication
public class PurchaseMain {
    public static void main(String[] args){
        SpringApplication.run(PurchaseMain.class,args);
    }
}
