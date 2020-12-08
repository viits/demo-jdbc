package db;

public class DbException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	DbException(String msg){
		super(msg);
	}
	
}
