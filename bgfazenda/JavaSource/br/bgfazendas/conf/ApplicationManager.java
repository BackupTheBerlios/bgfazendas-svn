package br.bgfazendas.conf;

import org.mentawai.core.ActionConfig;
import org.mentawai.core.Forward;
import org.mentawai.core.Redirect;

import br.bgfazendas.action.LoginAction;
import br.bgfazendas.action.SobreAction;
/**
 * 
 * @author Brunno de Almeida Santos (BGFazendas)
 *
 */
public class ApplicationManager extends org.mentawai.core.ApplicationManager{
	
	public void loadActions(){
		String PAGINA_DE_ERRO_JSP= "/erro.jsp";
		String PAGINA_DE_LOGIN_JSP = "/login.jsp";
		
		setDebugMode(true);
		
		ActionConfig ac = new ActionConfig("Login", LoginAction.class);
		ac.addConsequence(LoginAction.SUCCESS, new Redirect("/bgEscopo.jsp"));
		ac.addConsequence(LoginAction.ERROR,  new Forward(PAGINA_DE_LOGIN_JSP));
		addActionConfig(ac);

		ActionConfig actionConfig = null;

		actionConfig = new ActionConfig("sobre", SobreAction.class);
	    actionConfig.addConsequence(SobreAction.SUCCESS, new Forward("/sobre.jsp"));
	    actionConfig.addConsequence(SobreAction.ERROR, new Forward(PAGINA_DE_ERRO_JSP));
	    addActionConfig(actionConfig);
	}
}
