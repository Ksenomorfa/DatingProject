package ru.date.world.config;
 
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.FilterRegistration;
 
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.filter.CharacterEncodingFilter;
/* 
Инициалиазатор заменен вместо кода нижу для поддержки UTF-8 в полях ввода - Filter Registration, 
т.к. пока не разобралась как приделать его через get 

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { DatingConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    */

public class DatingInitializer implements WebApplicationInitializer {
        
        public void onStartup(ServletContext container) throws ServletException {
 
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(DatingConfiguration.class);
        ctx.setServletContext(container);
 
        FilterRegistration.Dynamic fr = container.addFilter("encodingFilter",
        new CharacterEncodingFilter());
        fr.setInitParameter("encoding", "UTF-8");
        fr.setInitParameter("forceEncoding", "true");
        fr.addMappingForUrlPatterns(null, true, "/*");
        
        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcher", new DispatcherServlet(ctx));            
    
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
 
     
}
