package flexon.project;

import java.util.ArrayList;

public class UserAccountDAO {

	ArrayList<UserAccount> javaClass = new ArrayList<UserAccount>();
	private ConnSingleton cu = ConnSingleton.getConnSingleton();

	// Create Method --> Insert statement
	public void createUser(UserAccount newUser) {
		javaClass.add(newUser);
	}

	// Read Method --> Select statement
	public void readUsers() {
		for (UserAccount user : javaClass) {
			System.out.println("*************************");
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPhoneNumber());
			System.out.println(user.getSsn());
			System.out.println("*************************");
			System.out.println();
		}
	}

	// Read Method --> Select from where statement
	public void readUsers(String name) {
		for (UserAccount user : javaClass) {

		}
	}

	// Update Method --> Update SQL statement
	public void updateUser(UserAccount newUser) {
		javaClass.add(newUser);
	}

	// Delete Method --> Delete SQL statement
	public void deleteUser(UserAccount newUser) {
		javaClass.remove(newUser);
	}

}
