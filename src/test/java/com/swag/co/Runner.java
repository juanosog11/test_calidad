package com.swag.co;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.swag.co.definitions",
        tags = "@cotizarEnvio"
)
public class Runner {

    @AfterClass
    public static void generateReport() {
        try {
            String mvnCommand = "C:\\Users\\DELL\\Downloads\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin\\mvn.cmd";
            ProcessBuilder processBuilder = new ProcessBuilder(mvnCommand, "serenity:aggregate");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Puedes leer la salida del proceso aquí si lo deseas
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor(); // Espera a que el proceso termine
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
