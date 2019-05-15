# jruby-issue-5707

This issue is specific to Windows Traditional Chinese edition but can be reproduced on any Windows edition by enforcing the default traditional chinese edition file encoding, that is MS950. Please note that this issue is not reproducible on Linux.

### Command for Windows traditional Chinese Edition
``java -cp jrubyTest.jar;jruby-complete-9.2.6.0.jar jrbuy.encoding.error.JRubyEvalTest``


### Command for any Windows Edition
``java -Dfile.encoding=MS950 -cp jrubyTest.jar;jruby-complete-9.2.6.0.jar jrbuy.encoding.error.JRubyEvalTest``

### Output
```
c:\jruby-issue-5707>java -Dfile.encoding=MS950 -cp jrubyTest.jar;jruby-complete-9.2.6.0.jar jrbuy.encoding.error.JRubyEvalTest
Exception in thread "main" org.jruby.exceptions.MainExitException: unknown encoding name - MS950
```
