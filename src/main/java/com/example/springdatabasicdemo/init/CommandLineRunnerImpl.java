package com.example.springdatabasicdemo.init;

import com.example.springdatabasicdemo.dtos.GroupDto;
import com.example.springdatabasicdemo.dtos.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {



    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void printAllStudentsByGroupName(String groupName) {

    }

    private void seedData() throws IOException {

    }
}
