package org.vitalii.fedyk.librarynotificationsservice.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.vitalii.fedyk.librarynotificationsservice.dto.BorrowedBookNotificationDto;
import org.vitalii.fedyk.librarynotificationsservice.dto.UserRegistrationNotificationDto;

import static org.vitalii.fedyk.librarynotificationsservice.constant.TopicConstants.BORROWED_BOOK_NOTIFICATION;
import static org.vitalii.fedyk.librarynotificationsservice.constant.TopicConstants.USER_REGISTRATION_NOTIFICATION;

@Service
public class EventConsumer {
    @KafkaListener(topics = USER_REGISTRATION_NOTIFICATION)
    public void consumeUserRegistrationNotification(final UserRegistrationNotificationDto message) {
        System.out.println("Email " + message.getEmail());
        System.out.println(message.getFirstName() + ", you have signed up!");
    }

    @KafkaListener(topics = BORROWED_BOOK_NOTIFICATION)
    public void consumeBorrowedBookNotification(final BorrowedBookNotificationDto message) {
        System.out.println("Email " + message.getEmail());
        System.out.println(message.getFirstName() + ", you have borrowed '" + message.getBookTitle() + "'!");
    }
}
