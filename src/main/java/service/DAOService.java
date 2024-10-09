package service;

public interface DAOService {
	public boolean verifyLogin(String email,String password);
	public void saveRegistration(String name,String city,String email,String mobile);
	public void connectDb();
	
}
