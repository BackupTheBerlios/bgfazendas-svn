import java.sql.Connection;

import org.mentawai.core.Context;
import org.mentawai.db.C3P0ConnectionHandler;
import org.mentawai.db.ConnectionHandler;
import org.mentawai.filter.ConnectionFilter;
import org.mentawai.filter.DIFilter;
import org.mentawai.filter.InjectionFilter;
import org.mentawai.filter.IoCFilter;
import org.mentawai.filter.ValidatorFilter;
import org.mentawai.transaction.JdbcTransaction;

public class ApplicationManager extends org.mentawai.core.ApplicationManager	
{

	private ConnectionHandler connection;
	
	public void init(Context application)
	{
		ioc("transaction", JdbcTransaction.class);

		//this.connection = new C3P0ConnectionHandler("com.mysql.jdbc.Driver","jdbc:mysql://187.45.196.149:3306/virtualbrecho","virtualbrecho","dks7rw");
		
		configureActions("action");
		configureActions("action.vacina");
		
	}
	
	public void loadActions()
	{
		filter(new ValidatorFilter("ERROR_VALIDACAO"));
		// IoC (Autowiring)
		filter(new IoCFilter());
		filter(new ConnectionFilter("connection", connection));
		filter(new DIFilter());
		di("connection",Connection.class);
		// Injection for actions (or models if action implements ModelDriven)
		filterLast(new InjectionFilter());
		
		
	}
	
	public void loadLists()
	{
		/*
		DBListData arrayCategoria = new DBListData("arrayCategoria", "id_categoria", "categoria", "PRODUTOS_CATEGORIA", "categoria");		
		addList(arrayCategoria, connection);
		
		DBListData arrayEstado = new DBListData("arrayEstado", "id", "nome", "TB_ESTADOS", "nome");		
		addList(arrayEstado, connection);
		*/
	}
}


		