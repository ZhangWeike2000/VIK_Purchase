package csxt;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Scanner;

@EnableTransactionManagement//开启事务
@SpringBootApplication
public class PurchaseMain {
    public static void main(String[] args){
        SpringApplication.run(PurchaseMain.class,args);
    }
}
