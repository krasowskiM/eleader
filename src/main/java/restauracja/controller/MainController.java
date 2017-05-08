package restauracja.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import restauracja.request.IphoneRequest;
import restauracja.response.IphoneResponse;
import restauracja.response.TableResponse;
import restauracja.service.TableService;

/**
 * Klasa miałaby obsługiwać zapytania przychodzące od klientów - zarówno mobilnych jak i webowych
 */
@RestController
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);
    private TableService tableService;

    @Autowired
    public MainController(TableService tableService){
        this.tableService = tableService;
    }
    //Stworzyłem tą metodę dla sprawdzenia czy zdalna aplikacja połączyłaby się z serwerem
    @RequestMapping(value = "/reservationReq", method = RequestMethod.POST)
    public IphoneResponse returnToIphone(IphoneRequest iphoneRequest){
        logger.info("Iphone response in handling");
        //Poprzednio źle zadeklarowałem typ zwracanych danych - powinien on wyglądać w ten sposób
        return new IphoneResponse(true);
    }

    @RequestMapping(value = "/tables", method = RequestMethod.GET)
    public TableResponse admTables(){
        return new TableResponse(tableService.findAll());
    }
}
