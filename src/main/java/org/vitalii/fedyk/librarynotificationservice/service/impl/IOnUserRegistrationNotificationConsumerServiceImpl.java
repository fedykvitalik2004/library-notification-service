package org.vitalii.fedyk.librarynotificationservice.service.impl;

import org.springframework.stereotype.Service;
import org.vitalii.fedyk.librarynotificationservice.consumer.IOnUserRegistrationNotificationConsumerService;
import org.vitalii.fedyk.librarynotificationservice.dto.UserRegistrationNotificationDto;

@Service
public class IOnUserRegistrationNotificationConsumerServiceImpl implements IOnUserRegistrationNotificationConsumerService {
    @Override
    public void onUserRegistrationNotification(final UserRegistrationNotificationDto payload,
                                               final UserRegistrationNotificationDtoHeaders headers) {
        System.out.println(payload);
    }
}