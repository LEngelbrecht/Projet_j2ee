package fr.ulco.isidis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.ulco.Boutiqueejb.Categorie;
import fr.ulco.Boutiqueejb.accesCatalogueBeanRemote;

/**
 * Servlet implementation class MaboutiqueServlet
 */
@WebServlet("/MaboutiqueServlet")
public class MaboutiqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaboutiqueServlet() {
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
		Cat(request, response);
	}

	protected void Cat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession  session = request.getSession(true);
		
		List<Categorie> categorie = null;
		
				
		try{
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES , "org.jboss.ejb.client.naming");
			
			final Context context = new InitialContext(jndiProperties);
			final String appliName = "MaboutiqueEAR";
			final String moduleName = "MaboutiqueEJB";
			final String distinctName = "" ;
			final String beanName= "Maboutique1JNDi";
			final String viewClassName= accesCatalogueBeanRemote.class.getName();
			
			accesCatalogueBeanRemote remote = (accesCatalogueBeanRemote) context.lookup("ejb:" + appliName+ "/" +moduleName + 
					"/" + distinctName + "/" + beanName +"!" +viewClassName);
		
			 categorie= new ArrayList<Categorie>(remote.getListCategories());
			 
			 
		}catch(Exception e){
			e.printStackTrace();
		}
		
		session.setAttribute("categorie", categorie);
						
		response.sendRedirect("categories134.jsp");
	}
}
