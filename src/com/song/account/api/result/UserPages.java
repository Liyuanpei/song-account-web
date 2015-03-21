package com.song.account.api.result;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.song.account.entity.User;
import com.song.commons.api.Pages;;

@XmlRootElement
public class UserPages extends Pages {

	private static final long serialVersionUID = -4255076721934489790L;

	List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
