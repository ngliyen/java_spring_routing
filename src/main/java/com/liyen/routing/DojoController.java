package com.liyen.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {

    @RequestMapping("/{dojo}")
    public String showDojoMessage(@PathVariable("dojo") String dojo){
    	System.out.println(dojo);
    	if (dojo.equals("dojo")){
    		return "The dojo is awesome!";
    	}
    	else if (dojo.equals("burbank-dojo")) {
    		return "Burbank Dojo is located in Southern California";
    	}
    	else if (dojo.equals("san-jose")) {
    		return "SJ dojo is the headquarters";
    	}
    	return "No such URL exists";
     }

}
