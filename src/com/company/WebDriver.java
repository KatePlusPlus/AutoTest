package com.company;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
public class WebDriver {
    @Test
    public void reach_beru() {
        open("https://beru.ru/");
        //new BeruPage().searchFor("зубные щетки");
        open("https://beru.ru/login");
        //$(By.name("user.name")).setValue("Selenid");
        //$("#submit").click();
        $(".loading process").should();

    }
}
