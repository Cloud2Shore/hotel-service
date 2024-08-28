package hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelServiceController {

    @GetMapping("/checkAvailability")
    public boolean checkRoomAvailability(@RequestParam("hotelId") String hotelId, @RequestParam("roomType") String roomType) {
        // Placeholder for real availability check
        return true;
    }
}

