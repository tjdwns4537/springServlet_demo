package springmvc.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogingTestController {

    @RequestMapping("/log-test")
    public String logRest() {
        String name = "Spring";
        log.trace("info trace = {}", name);
        log.debug("info debug = {}", name);
        log.info("info log = {}", name);
        log.warn("info warn = {}", name);
        log.error("info error = {}", name);
        return "ok";
    }
}
