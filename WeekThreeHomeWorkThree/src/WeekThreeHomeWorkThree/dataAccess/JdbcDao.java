package WeekThreeHomeWorkThree.dataAccess;

public class JdbcDao<T> implements BaseDao<T>{

	@Override
	public void add(T o) {
		System.out.println("JDBC ile veritaban�na eklendi.");
		
	}

}
