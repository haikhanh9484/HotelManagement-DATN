package vn.com.hotelmanagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import vn.com.hotelmanagement.HotelManagementApp;
import vn.com.hotelmanagement.RedisTestContainerExtension;
import vn.com.hotelmanagement.config.EmbeddedMongo;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = HotelManagementApp.class)
@ExtendWith(RedisTestContainerExtension.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
