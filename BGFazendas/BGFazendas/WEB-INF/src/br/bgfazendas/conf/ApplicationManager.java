package br.bgfazendas.conf;
import org.mentawai.core.*;

import br.bgfazendas.action.VacinaAction;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
    public void loadActions() {
        
        // Ruby style: less verbose and less clear
        
        action("/VacinaAction", VacinaAction.class)
            
            .on(SUCCESS, fwd("/hello.jsp"))
            .on(ERROR, fwd("/username.jsp"));
            
        // Java style: more verbose and more clear
        
        ActionConfig ac = new ActionConfig("/VacinaAction", VacinaAction.class);
        ac.addConsequence(SUCCESS, new Forward("/hello.jsp"));
        ac.addConsequence(ERROR, new Forward("/username.jsp"));
        addActionConfig(ac); // add this action to the application manager
            
    }
}
