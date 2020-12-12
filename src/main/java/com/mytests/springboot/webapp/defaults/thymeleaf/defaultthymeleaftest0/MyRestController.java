package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest0;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by ${USER} on ${DATE}.</p>
 * <p>Project: ${PROJECT_NAME}</p>
 * *
 */     
@RestController
public class MyRestController {
    public static final String EXPLICIT = "/testExplicitConst/{arg}";
    public static final String MYCONST = "/const";
    @RequestMapping(EXPLICIT)
    public String testExplicitConst(@PathVariable("arg") String arg) {
        return arg;
    }
    @RequestMapping(MYCONST + "/{arg}")
    public String testFrontConst(@PathVariable("arg") String arg) {
        return arg;
    }
    @RequestMapping("/{arg}" + MYCONST)
    public String testTailConst(@PathVariable("arg") String arg) {
        return arg;
    }
}
