package top.imugen.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 *
 * @author macro
 * @date 2018/4/26
 */
@SpringBootApplication
@MapperScan(value = {"top.imugen.shop.mapper"})
public class ShopAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopAdminApplication.class, args);
    }
}
