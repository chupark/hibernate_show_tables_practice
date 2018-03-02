package com.chiwoo.hiber01;

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

@Controller
public class BoardController {
	private UserInfoProvider provider = new UserInfoHibernateProviderImpl();
	private TB_BoardProvider tb_provider = new TB_BoardHibernateProviderImpl();
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@RequestMapping(value = "/test")
	public String test(Locale locale, Model model) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		UserInfo userInfo = new UserInfo("demonha", "테스터", "rkqtlek");
		//provider.insertUser(userInfo);
		
		
		System.out.println("여기를 통과 못할듯");
		//List <UserInfo> userInfos = provider.findAllUsers();
		List <TB_Board> tb_Board = tb_provider.findAllData();
		System.out.println("ㅇㅋㅇㅋ");
		
		System.out.println("헬로");
		//System.out.println(userInfos.get(0).getAddress());
		//System.out.println(userInfos.get(0).getName());
		//System.out.println(userInfos.get(0).getUserId());
		
		
		//model.addAttribute(userInfos);
		model.addAttribute("tb_Board", tb_Board);
		
		return "test";
	}
}
