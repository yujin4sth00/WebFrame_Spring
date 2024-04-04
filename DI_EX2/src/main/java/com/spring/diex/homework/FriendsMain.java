package com.spring.diex.homework;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FriendsMain {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("FriendsSetting.xml");
		// TODO Auto-generated method stub
		
		FriendsMap friendsMap = (FriendsMap) context.getBean("friendsMap");
		Map<String, String> friendsInfo = friendsMap.getFriendsInfo();
		
		for(Map.Entry<String, String> friends : friendsInfo.entrySet()) {
			System.out.println(friends.getKey() + " , " + friends.getValue());
		}
		
	}

}
