package easy.framework.plugin;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author limengyu
 * @create 2017/10/24
 */
public class RestWebPlugin extends WebPlugin {
	@Override
	public void register(ServletContext servletContext) {
		ServletRegistration sr = servletContext.addServlet("jerseyServlet", "com.sun.jersey.spi.container.servlet.ServletContainer");
		sr.setInitParameter("jersey.config.server.provider.packages", RestConfigConstant.getRestProviderPackage());
		sr.setInitParameter("jersey.config.server.provider.scanning.recursive", RestConfigConstant.getRestProviderPackageScannRecursive());
		sr.addMapping(RestConfigConstant.getRestUrlPattern());
	}
	@Override
	public void init() {
	}
	@Override
	public void destroy() {
	}
	@Override
	public String getName() {
		return RestConfigConstant.PLUGIN_NAME;
	}
}
