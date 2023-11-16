package com.example.springdatabasicdemo.dtos;

public class StudentDto {

    private int id;
    private String name;
    private GroupDto group;

    public StudentDto(int id, String name, GroupDto group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public StudentDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupDto getGroup() {
        return group;
    }

    public void setGroup(GroupDto group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student { id=" + id + ", name=" + name + " }";
    }
}
