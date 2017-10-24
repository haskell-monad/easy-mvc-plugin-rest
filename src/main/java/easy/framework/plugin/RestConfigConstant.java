package easy.framework.plugin;

import org.apache.commons.lang3.StringUtils;

import easy.framework.helper.ConfigHelper;

/**
 * @author limengyu
 * @create 2017/10/23
 */
public class RestConfigConstant {
	/**
	 * 插件名称
	 */
	public static final String PLUGIN_NAME = "Jersey-Rest";
	/**
	 * rest服务url-pattern默认值
	 */
	public static final String REST_URL_PATTERN_DEFAULT = "/rest/*";
	/**
	 * rest服务url-pattern默认值
	 */
	public static final String REST_URL_PATTERN = "rest.plugin.url.pattern";
	/**
	 * 暴露的rest服务所在包，多个话以逗号分隔
	 */
	public static final String REST_PROVIDER_PACKAGES = "rest.plugin.provider.packages";
	/**
	 * 是否递归扫描包
	 */
	public static final String REST_PROVIDER_PACKAGE_SCANN_RECURSIVE = "rest.plugin.provider.scanning.recursive";

	public static String getRestProviderPackage() {
		String packages = ConfigHelper.getConfigValue(REST_PROVIDER_PACKAGES);
		if (StringUtils.isBlank(packages)) {
			return null;
		} else {
			return packages;
		}
	}
	public static String getRestProviderPackageScannRecursive() {
		String flag = ConfigHelper.getConfigValue(REST_PROVIDER_PACKAGE_SCANN_RECURSIVE);
		if (StringUtils.isBlank(flag)) {
			return "false";
		} else {
			return flag;
		}
	}
	public static String getRestUrlPattern() {
		String pattern = ConfigHelper.getConfigValue(REST_URL_PATTERN);
		if (StringUtils.isBlank(pattern)) {
			return REST_URL_PATTERN_DEFAULT;
		} else {
			return pattern;
		}
	}
}
