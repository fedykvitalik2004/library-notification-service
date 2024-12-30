package org.vitalii.fedyk.librarynotificationsservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static org.vitalii.fedyk.librarynotificationsservice.constant.TopicConstants.BORROWED_BOOK_NOTIFICATION;
import static org.vitalii.fedyk.librarynotificationsservice.constant.TopicConstants.USER_REGISTRATION_NOTIFICATION;

@Configuration
public class EventTopicConfig {
    @Bean
    public NewTopic userRegistrationNotificationTopic() {
        return TopicBuilder
                .name(USER_REGISTRATION_NOTIFICATION)
                .build();
    }

    @Bean
    public NewTopic borrowedBookNotificationTopic() {
        return TopicBuilder
                .name(BORROWED_BOOK_NOTIFICATION)
                .build();
    }
}
