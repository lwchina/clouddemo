package cloud.server.ribbon.service;

import cloud.server.ribbon.vo.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author wei.liu
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-09
 * Time: 11:01
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String home(String param) {
        Params params = new Params();
        params.setParam(param);
        return restTemplate.postForObject("http://service-helloworld", params, String.class);
    }
}
