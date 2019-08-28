package org.jboss.tools.examples.ticketmonster.test.rest;

import org.jboss.tools.examples.ticketmonster.model.Booking;
import org.jboss.tools.examples.ticketmonster.rest.BaseEntityService;
import org.jboss.tools.examples.ticketmonster.rest.dto.VenueDTO;
import org.jboss.tools.examples.ticketmonster.service.*;
import org.jboss.tools.examples.ticketmonster.test.TicketMonsterDeployment;
import org.jboss.tools.examples.ticketmonster.util.MultivaluedHashMap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class RESTDeployment {

    public static WebArchive deployment() {


        return TicketMonsterDeployment.deployment()
                .addPackage(Booking.class.getPackage())
                .addPackage(BaseEntityService.class.getPackage())
                .addPackage(VenueDTO.class.getPackage())
                .addPackage(MultivaluedHashMap.class.getPackage())
                .addPackage(SeatAllocationService.class.getPackage())
                .addClass(AllocatedSeats.class)
                .addClass(MediaPath.class)
                .addClass(MediaManager.class);
    }
    
}
