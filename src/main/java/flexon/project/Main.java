package flexon.project;

public class Main {

	public static void main(String[] args) {

		UserAccountDAO studentDAO = new UserAccountDAO();

		/*
		 * do {
		 * 
		 * UserAccount Jerome = new UserAccount(); Jerome.setFirstName("Jerome");
		 * Jerome.setLastName("Singh"); Jerome.setSsn(1234567);
		 * Jerome.setPhoneNumber(646718273);
		 * 
		 * }while(exit)
		 */

		UserAccount Jerome = new UserAccount();
		Jerome.setFirstName("Jerome");
		Jerome.setLastName("Zhang");
		Jerome.setSsn(1234567);
		Jerome.setPhoneNumber(646718273);

		studentDAO.createUser(Jerome);
		studentDAO.createUser(Jerome);
		studentDAO.createUser(Jerome);
		studentDAO.createUser(Jerome);
		studentDAO.createUser(Jerome);
		studentDAO.createUser(Jerome);

		studentDAO.readUsers();

	}
}
