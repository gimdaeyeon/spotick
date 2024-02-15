package com.app.spotick.repository.ticket;

import com.app.spotick.domain.dto.page.TicketPage;
import com.app.spotick.domain.dto.ticket.TicketInfoDto;
import com.app.spotick.domain.dto.ticket.TicketManageListDto;
import com.app.spotick.domain.type.ticket.TicketRequestType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TicketQDSLRepository {

    TicketPage findHostTicketListByUserId(Long userId, Pageable pageable, TicketRequestType ticketRequestType);

    Optional<TicketInfoDto> findTicketInfoByTicketId(Long ticketId, Long userId);
}