# 学习项目

## 用户问题

在docker容器中的用户和host主机中的用户是同一个，比如ROOT用户。

所以在`Dockerfile`中设置一个用户pid为1000,uid为1000，指定文件夹为特定用户，这样跟host主机上使用的非ROOT用户一致，保证volume的权限一致性

## 开发模式

在IDEA中打开`worker`项目，因为IDEA使用`shift+ctrl+f9`或者`ctrl+f9`只会在`worker`目录下触发，然后在`app`目录下操作`docker-compose`

```
depends_on:
  - mysql
mysql:
container_name: some-mysql
image: mysql:8.0.15
environment:
  MYSQL_DATABASE: db_test
  MYSQL_ROOT_PASSWORD: pa55w0rd
  MYSQL_ROOT_HOST: '%'
ports:
  - "3306:3306"
restart: always
```
