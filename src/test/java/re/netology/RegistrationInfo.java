package re.netology;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.RequiredArgsConstructor;


import java.util.Locale;

@Data
@RequiredArgsConstructor
public class RegistrationInfo {
    Faker faker = new Faker(new Locale("ru"));
    private String name = faker.name().lastName();
    private String phone = faker.phoneNumber().phoneNumber();
    private String city = faker.address().city();
}
