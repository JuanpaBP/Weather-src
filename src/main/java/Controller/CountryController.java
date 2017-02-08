package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Usuario on 08/02/2017.
 */
@RestController
public class CountryController {

    @RequestMapping(value = "/Country", method = RequestMethod.GET)
    public ResponseEntity<String> showSomething(){

        return new ResponseEntity<String>("This works", HttpStatus.OK);
    }

}
