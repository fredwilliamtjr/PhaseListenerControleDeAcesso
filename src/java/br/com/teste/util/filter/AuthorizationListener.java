package br.com.teste.util.filter;



import br.com.teste.model.grupo;
import br.com.teste.model.usuario;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

public class AuthorizationListener implements PhaseListener {

    public void afterPhase(PhaseEvent event) {

        FacesContext facesContext = event.getFacesContext();
        String currentPage = facesContext.getViewRoot().getViewId();

        //LISTA DE PAGINAS A CONTROLAR.
        boolean isIndex1Page = (currentPage.lastIndexOf("index.xhtml") > -1);
        boolean isIndex2Page = (currentPage.lastIndexOf("index2.xhtml") > -1);
        boolean isIndex3Page = (currentPage.lastIndexOf("index3.xhtml") > -1);
        // FIM DA LISTA DE PAGINAS A CONTROLAR.

        // CARREGA E SETA OS PARAMETROS NO USUARIO.
        usuario u = new usuario();
        grupo g = new grupo();
        g.setIndex(true);
        g.setIndex2(true);
        g.setIndex3(false);
        u.setGrupo(g);
        u.setLogado(true);

        // SE O USUARIO ESTIVER DESLOGADO VAI SEMPRE PARA LOGIN.XHTML
        if (!u.isLogado()) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null, "/login.xhtml");
        }

        //SE O PARAMETRO DA PAGINA ESTIVER TRUE NO USUAARIO ELE VAI ACESSAR, CASO NÃO VAI SER DIRECIANADO PARA LOGIN.
        if (isIndex1Page && !u.getGrupo().isIndex()) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null, "/login.xhtml");
        }

        //SE O PARAMETRO DA PAGINA ESTIVER TRUE NO USUAARIO ELE VAI ACESSAR, CASO NÃO VAI SER DIRECIANADO PARA LOGIN.
        if (isIndex2Page && !u.getGrupo().isIndex2()) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null, "/login.xhtml");
        }

        //SE O PARAMETRO DA PAGINA ESTIVER TRUE NO USUAARIO ELE VAI ACESSAR, CASO NÃO VAI SER DIRECIANADO PARA LOGIN.
        if (isIndex3Page && !u.getGrupo().isIndex3()) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null, "/login.xhtml");
        }

    }

    public void beforePhase(PhaseEvent event) {
        // Mostra os estados da fase do JSP
        System.out.println("FASE :  " + event.getPhaseId());
    }

    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }

}
