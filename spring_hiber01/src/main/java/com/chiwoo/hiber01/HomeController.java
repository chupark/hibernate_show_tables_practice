package com.chiwoo.hiber01;


import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.TB_Board;
import domain.UserInfo;
import service.TB_BoardProvider;
import service.UserInfoProvider;
import service_Impl.TB_BoardHibernateProviderImpl;
import service_Impl.UserInfoHibernateProviderImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private UserInfoProvider provider = new UserInfoHibernateProviderImpl();
	private TB_BoardProvider tb_provider = new TB_BoardHibernateProviderImpl();
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
