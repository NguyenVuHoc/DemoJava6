package com.example.demorestfulapi.Buoi1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class StudentConfig {

//    Dùng để khởi tạo dữ liệu khi chạy project

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student john = new Student(
//                    "John",
//                    "john306@gmail.com",
//                    21
//            );
//            Student alex = new Student(
//                    "Alex",
//                    "alex121@gmail.com",
//                    22
//            );
//            repository.saveAll(
//                    List.of(john, alex)
//            );
//        };
//    }

//    Check ngoại lệ

//    public void addNewStudent(Student student) {
//        Optional<Student> studentOptional = studentRepository
//                .findStudentByEmail(student.getEmail());
//        if (studentOptional.isPresent()){
//            throw new IllegalStateException("email taken");
//        }
//        studentRepository.save(student);
//    }
}
