# kotlin_web_test
这个是kotlin + idea + maven + spring boot 生成的测试工程
里边实现了最简单的调用测试接口, 这个没有用数据库，可以直接运行。

这个工程是：先用idea 生成一个idea的spring boot 工程，语言用kotlin，然后在里边写最简单的测试，没用用数据库可以直接使用。

调用的测试接口是：
1. 增加一个用户
http://localhost:8080/api/add?name=a&pwd=1

http://localhost:8080/api/add?name=b&pwd=2

http://localhost:8080/api/add?name=c&pwd=3

2. 查询一个用户
http://localhost:8080/api/get?name=b
