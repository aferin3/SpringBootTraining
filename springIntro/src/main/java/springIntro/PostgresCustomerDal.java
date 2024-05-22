package springIntro;

public class PostgresCustomerDal implements ICustomerDal{
	String jdbcString;
	
	public String getJdbcString() {
		return jdbcString;
	}



	public void setJdbcString(String jdbcString) {
		this.jdbcString = jdbcString;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("postgres eklendi "+ jdbcString);
	}

}
