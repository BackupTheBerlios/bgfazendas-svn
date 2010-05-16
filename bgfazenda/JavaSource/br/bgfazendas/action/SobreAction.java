package br.bgfazendas.action;

import org.mentawai.core.ActionException;

/**
 * 
 * @author Brunno de Almeida Santos (BGFazendas)
 *
 */

public class SobreAction extends org.mentawai.core.BaseAction implements org.mentawai.filter.AuthenticationFree {

	/**
	 * action inicial
	 */
    public String execute() throws ActionException {

		// Creditos
		output.setValue("versao","1 R0");
		// especifica consequencia de sucesso
    	return SUCCESS;
    }

	@Override
	public boolean bypassAuthentication(String arg0) {
		String a ="";
		return false;
	}

}
