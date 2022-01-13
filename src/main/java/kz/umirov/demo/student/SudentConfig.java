package kz.umirov.demo.student;

import org.springframework.aop.TargetSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class SudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student toka = new Student(
                    "Toka",
                    "tokataeva@gmail.com",
                    LocalDate.of(1996, Month.JULY, 6)
            );
            Student korjik = new Student(
                    "Korjik",
                    "dutzian@gmail.com",
                    LocalDate.of(1995, Month.SEPTEMBER, 5)
            );

            Student yerlan = new Student(
                    "Yerlan",
                    "zodd@gmail.com",
                    LocalDate.of(1990, Month.JUNE, 7)
            );

            repository.saveAll(
                    List.of(toka, korjik, yerlan)
            );
        };
    }
}
