# 工程简介
<<<<<<< HEAD

登录测试
post方法测试，APIfox和postman的测试

=======
=======
>>>>>>> master
## 登录模块
可以根据数据库中已经录入的用户身份进行登录
TODO: 完善界面，完成登录密码加密，添加各种登录方式
## 主页显示用户信息模块
<<<<<<< HEAD
> 6c94cc7 (修改canvasController)

# 开发计划
## 后端接口开发
* 一天完成基础canvas的curd编辑api
* 两天完成搜索引擎
* 两天完成推荐系统
## 前端计划
在后端接口差不多时候，进行前端开发
* 将api调用起来
* 将页面整合起来
# 开发过程记录
## 前端开发 优先级 1

## 后端开发 优先级 0
### 三个大模块 （基础canvas编辑、搜索引擎、推荐系统）
三个模块之间可以逐渐开发，因为前者的开发结果，后者可以调用
### 当前进度 （current position ！！！）
当前正在做的是一个单用户的产品，不考虑有很多用户的情况。
#### canvas编辑模块
> TODO: 

> ~~需要将Canvas实体中添加和修改一些属性~~  **DONE!**

> 更新controller中的 update 方法，如果有改动，全部重新赋值，

> ~~然后需要修改对应的controller和mapper类~~  **currently DONE！**

# 需要学习的技能

## 问题描述
### controller中API如何定义 REST 风格
> URL仅仅是标识资源的路劲，而具体的行为由HTTP方法来指定。
> （路径代表资源，方法代表资源的操作。）
> 
> 对于一个资源，比如一个团队实体，那么删除，更新和查询一个团队成员的API请求参数只需要带上对应的ID即可.
> 通过不同的HTTP请求方法会对应调用对应的后端方法。 
> 如/team/1 HTTP.Method = get  意思是请求获取ID=1对应的成员， 对于/team/1 HTTP.Method=delete 则是删除对应的ID=1的成员。
### HttpServletRequest 这个类的常用方法以及如何通过请求参数获取keywords数组
（这个方法准备用于推荐系统）
### controller中的方法返回值如何选择？
### update方法在controller中一般如何用？
> 解决方法：
> 学习SpringMVC相关的注解
> 
>@RestController
@ResponseBody
@RequestBody
@RequestMapping
@GetMapping
@PostMapping
@PutMapping
@DeleteMapping
@PathVariable




=======
> master

# 延伸阅读

