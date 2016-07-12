package fr.ulco.isidis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.Column;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.ulco.Boutiqueejb.Categorie;
import fr.ulco.Boutiqueejb.Client;
import fr.ulco.Boutiqueejb.GestionClientBeanRemote;
import fr.ulco.Boutiqueejb.accesCatalogueBeanRemote;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}
	
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InsertionClient(request, response);
	}
	
	protected void InsertionClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Client c = new Client();
		String nom = request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String mail =request.getParameter("email");
		String mdp =request.getParameter("mdp");
		try{
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES , "org.jboss.ejb.client.naming");
			
			final Context context = new InitialContext(jndiProperties);
			final String appliName = "MaboutiqueEAR";
			final String moduleName = "MaboutiqueEJB";
			final String distinctName = "" ;
			final String beanName= "Maboutique1JNDi";
			final String viewClassName= accesCatalogueBeanRemote.class.getName();
			
			GestionClientBeanRemote remote = (GestionClientBeanRemote) context.lookup("ejb:" + appliName+ "/" +moduleName + 
					"/" + distinctName + "/" + beanName +"!" +viewClassName);
		
			remote.createClient(nom, prenom, mail, mdp);
			 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
