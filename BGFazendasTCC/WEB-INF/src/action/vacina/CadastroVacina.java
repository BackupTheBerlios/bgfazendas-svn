package action.vacina;

import org.mentawai.core.ApplicationManager;
import org.mentawai.core.BaseAction;
import org.mentawai.core.Configurable;
import org.mentawai.core.Forward;

public class CadastroVacina extends BaseAction implements Configurable{	
	//private SenhaDao alterarSenhaDao;
	public void configure(ApplicationManager appManager)
	{
		//appManager.ioc("alterarSenhaDao", SenhaDao.class);
		appManager.action("/Vacina/CadastroVacina", this.getClass())
			.on("alterarSenha", new Forward("/jsp/cadastro/alterarSenha.jsp"))
			.on("login", new Forward("/jsp/login.jsp"))
			;
	}	
	
	public void cadastrar()
	{
		System.out.println("VACINA CADASTRADA");
	}
	

}
