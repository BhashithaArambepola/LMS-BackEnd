package lk.ijse.dep8.lms.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
    private String name;
    private String id;
    private String email;

    public StudentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentDTO(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
