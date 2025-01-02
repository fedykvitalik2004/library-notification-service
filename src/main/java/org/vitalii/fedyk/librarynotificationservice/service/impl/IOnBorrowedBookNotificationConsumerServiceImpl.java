package org.vitalii.fedyk.librarynotificationservice.service.impl;

import org.springframework.stereotype.Service;
import org.vitalii.fedyk.librarynotificationservice.consumer.IOnBorrowedBookNotificationConsumerService;
import org.vitalii.fedyk.librarynotificationservice.dto.BorrowedBookNotificationDto;

@Service
public class IOnBorrowedBookNotificationConsumerServiceImpl implements IOnBorrowedBookNotificationConsumerService {
    @Override
    public void onBorrowedBookNotification(BorrowedBookNotificationDto payload, BorrowedBookNotificationDtoHeaders headers) {
        System.out.println(payload);
    }
}
