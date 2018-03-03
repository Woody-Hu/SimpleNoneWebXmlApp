package initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		 AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
		 
	        mvcContext.register(MvcConfig.class);
	 
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",new DispatcherServlet(mvcContext));
	 
	        dispatcher.setLoadOnStartup(1);
	 
	        dispatcher.addMapping("/");
	}

}
