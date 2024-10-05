package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student marian =   new Student(

                    "marina",
                    "lalal@.pl",
                    LocalDate.of(2000,1,1)

            );


            Student stefan =   new Student(
                    "alex",
                    "lala222l@.pl",
                    LocalDate.of(2022,1,1)

            );
            repository.saveAll(
                    List.of(marian, stefan)
            );
        };
    }
}
