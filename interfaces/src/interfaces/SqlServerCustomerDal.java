package interfaces;

public class SqlServerCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Sql server eklendi.");
		
	}

}
