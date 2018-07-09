package client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.liu
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-05
 * Time: 10:53
 */
@RestController
public class ViewController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/")
    public String home(String param) {
        return "hello world from port " + port + " >> param: " + param;
    }
}
