package restauracja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restauracja.request.IphoneRequest;
import restauracja.response.TableResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa miałaby obsługiwać zapytania przychodzące od klientów - zarówno mobilnych jak i webowych
 */
@RestController
public class MainController {

    //Stworzyłem tą metodę dla sprawdzenia czy zdalna aplikacja połączyłaby się z serwerem
    @RequestMapping(value = "/reservationReq", method = RequestMethod.POST)
    public ResponseEntity returnToIphone(IphoneRequest iphoneRequest){

        //Poprzednio źle zadeklarowałem typ zwracanych danych - powinien on wyglądać w ten sposób
        return new ResponseEntity(HttpStatus.OK);
    }

}
