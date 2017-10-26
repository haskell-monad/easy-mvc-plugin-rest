## Jersey-Rest [https://github.com/jersey/jersey]

### easy-mvc.properties文件中增加如下配置：

```java

  #服务所在包路径，有多个的话，使用逗号分隔
  jersey.config.server.provider.packages=xxx.xxx.xxx,xxx.xxx.xxx

  #是否递归扫描表(可选配置，默认值：false)
  jersey.config.server.provider.scanning.recursive=

  #mapping，(可选配置，默认值：/rest/*)
  rest.plugin.url.pattern=

```
