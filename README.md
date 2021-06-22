# 试验

```TLoggerContextInitializer#initialize```中，新```LogFile```后没有调用```applyToSystemProperties()```，导致没有设置```LOG_FILE```环境变量，导致```log4j2-file.xml```出错。

作为对比，```LoggingSystemProperties```和```LoggingApplicationListener```中均有调用