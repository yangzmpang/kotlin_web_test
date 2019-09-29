# kotlin_web_test
这个是kotlin + idea + maven + spring boot 生成的测试工程
里边实现了最简单的调用测试接口, 这个没有用数据库，可以直接运行。

1. 增加一个用户
http://localhost:8080/api/add?name=a&pwd=1
http://localhost:8080/api/add?name=b&pwd=2
http://localhost:8080/api/add?name=c&pwd=3

2. 查询一个用户
http://localhost:8080/api/get?name=b
