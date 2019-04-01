# 学习项目

## 问题

项目目录如下
```
project
├── .idea
├── .mvn
├── mvnw
├── mvnw.cmd
├── src
└── pom.xml
```
### 1. `maven wrapper`调用

通过maven生成项目以后，在项目目录下执行`mvn -N io.takari:maven:wrapper`，会生成三个文件`.mvn`，`mvnw`,`mvnw.cmd`。
执行`sh mvnw`可以替代`mvn`命令，在项目目录下会生成`.m2`文件，`.m2`文件不用上传，保存依赖文件

### 2. git上传时，文件保留

`.idea`文件是IDE的配置文件，应该予以保留，这样可以统一IDE环境

### 用户权限

在docker容器中的用户和host主机中的用户是同一个，比如ROOT用户。

所以在`Dockerfile`中设置一个用户pid为1000,uid为1000，指定文件夹为特定用户，这样跟host主机上使用的非ROOT用户一致，保证volume的权限一致性,
```
RUN groupadd -r -g 1000 appuser
RUN useradd -r -u 1000 -g 1000 -d /home/app appuser
USER appuser
```

### 开发模式

在IDEA中打开`worker`项目，因为IDEA使用`shift+ctrl+f9`或者`ctrl+f9`只会在`worker`目录下触发，然后在`app`目录下操作`docker-compose`

### docker-compose 容器关联

使用`depends_on`做依赖，可以在使用容器名作为别名依赖，比如在本例中，mysql容器被取名`datasource`,在应用调用mysql的url可以设置为`jdbc:mysql://datasource:3306`