package restauracja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import restauracja.request.IphoneRequest;
import restauracja.response.TableResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciek on 2017-05-05.
 */
@RestController
public class MainController {

//    private TableService tableService;

//    @RequestMapping(value = "/tables", method = RequestMethod.GET)
//    public List<TableResponse> tables(){
////        return tableService.getTables();
//    }

    @RequestMapping(value = "/reservationReq", method = RequestMethod.POST)
    public boolean returnToIphone(IphoneRequest iphoneRequest){
        return true;
    }

}
