package org.vitalii.fedyk.librarynotificationsservice.dto;

import java.io.Serializable;

public class UserRegistrationNotificationDto implements Serializable {
    private String firstName;
    private String email;

    public UserRegistrationNotificationDto() {
    }

    public UserRegistrationNotificationDto(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
