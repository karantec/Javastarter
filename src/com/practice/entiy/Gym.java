package com.practice.entiy;

import java.util.ArrayList;
import java.util.List;

public class Gym {
	static List<User> users=new ArrayList<User>();
	public static void main(String[] str) {
		createUsers();

	}
	private static void createUsers() {
		for (int i = 0; i < 10; i++) {
			User u1 = new User();
			u1.setAge((byte) (10 * i));
			u1.setName("Ram");
			users.add(u1);
		}
		System.out.println(users);
		users.get(0).workout();
		users.get(0).workoutOver();
//		Ram is working out
	}
}
//hashcode 
//com.practice.entiy.User@6f2b958e, com.practice.entiy.User@1eb44e46, com.practice.entiy.User@6504e3b2,
//com.practice.entiy.User@515f550a, com.practice.entiy.User@626b2d4a, com.practice.entiy.User@5e91993f,
//com.practice.entiy.User@1c4af82c, com.practice.entiy.User@379619aa, com.practice.entiy.User@cac736f, 
//com.practice.entiy.User@5e265ba4]
