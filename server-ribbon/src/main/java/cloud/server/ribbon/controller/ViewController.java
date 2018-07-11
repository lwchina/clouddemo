package cloud.server.ribbon.controller;

import cloud.server.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/")
    public String home(String param) {
        return ribbonService.home(param);
    }
}
