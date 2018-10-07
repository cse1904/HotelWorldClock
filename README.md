# HotelWorldClock
2018.10软测  
“码农酒店”世界时钟系统需求列表  
• REQ1: ”码农酒店”大堂里有5个时钟，分别显示北京、伦敦、莫斯科、悉尼和纽约的时间  
• REQ2: 伦敦与UTC时间一致，北京比UTC时间早8小时，莫斯科比UTC时间早4小时，悉尼比UTC 时间早10小时，纽约比UTC时间晚5小时  
• REQ3: 将酒店大堂服务员的智能手机时间设置为北京时间  
• REQ4: 若大堂墙壁上所有城市的时钟都或多或少有些走时不准，需要调整时间时，只需调准服务员手机的时间，那么墙上5个城市的时钟时间都能够相应地自动调整准确  
  
使用P3C进行代码静态分析，静态分析报告如下：  
![static](https://github.com/cse1904/HotelWorldClock/blob/master/pictures/static.png)
  
基于junit进行happy path测试，测试结果如下：  
![static](https://github.com/cse1904/HotelWorldClock/blob/master/pictures/happy.png)
  
根据检测报告进行修改完成如下：  
![static](https://github.com/cse1904/HotelWorldClock/blob/master/pictures/final.png)
