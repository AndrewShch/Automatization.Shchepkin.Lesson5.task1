package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.data.DataGenerator;
import ru.netology.data.RegistrationInfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {

    LocalDate date = LocalDate.now().plusDays(4);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    @BeforeEach
    void setUp() {
        open("http://localhost:9999");
    }
    @Test
    void shouldSuccessTest(){
        RegistrationInfo info = DataGenerator.Registration.generateByCard("ru");
        System.out.println(info.getCity() + info.getName() + info.getPhone());


    }

   }


