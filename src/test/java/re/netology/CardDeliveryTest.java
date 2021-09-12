package re.netology;

import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {
    LocalDate date = LocalDate.now().plusDays(4);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    @BeforeEach
    void setUp() {
        RegistrationInfo registrationInfo = new RegistrationInfo();
        open("http://localhost:9999");
    }

}
