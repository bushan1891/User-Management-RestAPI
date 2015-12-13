package user.egen.RestApp;
import static spark.Spark.get;
import static spark.Spark.post;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import io.swagger.jaxrs.config.BeanConfig;


@ApplicationPath("/api")
public class RestApp extends ResourceConfig {
	
	public RestApp(){
	    // once the request comes from /api it forwards to following package
		packages("user.egen.rest");
	}

}



 
