package com.it.startup.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gMain")
public class gMainController {
	/*
	 * private static final Logger logger = LoggerFactory
	 * getLogger(gMainController.class);
	 */
	@RequestMapping("/gMain.do")
	public void gMain() {
		/* logger.info("까꿍 메인 보여주기"); */
	}
}
