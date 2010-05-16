package action;

import org.mentawai.core.ApplicationManager;
import org.mentawai.core.BaseAction;
import org.mentawai.core.Configurable;
import org.mentawai.core.Forward;

public class Topo extends BaseAction implements Configurable{	
	//private SenhaDao alterarSenhaDao;
	public void configure(ApplicationManager appManager)
	{
		//appManager.ioc("alterarSenhaDao", SenhaDao.class);
		appManager.action("/Topo", this.getClass())
			.on("MENU", new Forward("/web/jsp/topo/TextoMenu.jsp"))
			;
	}	
	
	public String abrirMenu()
	{
		String menu = "<a href = '/BGFazendas'>PAGINA INICIAL</a> | AGENDA | <a href = '/BGFazendas/web/jsp/vacina/index.jsp'>VACINA</a> | LOGOUT";
		
		output.setValue("menu", menu);
		return "MENU";
	}

}
