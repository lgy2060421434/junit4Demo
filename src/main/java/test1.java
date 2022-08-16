import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class test1 {
    private  String caseIdentifiler;
    //全局超时校验
    @Rule
    public Timeout timeout = new Timeout(2000, TimeUnit.MICROSECONDS);
    @Rule
    public final TestName methodName = new TestName();

    @Rule
    public TestWatcher watcher = new TestWatcher() {
        @Override
        protected void starting(Description d) {
            caseIdentifiler=d.getClassName()+"."+d.getMethodName();
            System.out.println("starting: "+caseIdentifiler);
        }

        protected void succeeded(Description d) {
            caseIdentifiler=d.getClassName()+"."+d.getMethodName();
            System.out.println("succeeded: "+caseIdentifiler);
        }
        protected void failed ( Throwable e,Description d) {
            caseIdentifiler=d.getClassName()+"."+d.getMethodName();
            System.out.println("failed: "+caseIdentifiler);
        }

        protected void finished (Description d) {
            caseIdentifiler=d.getClassName()+"."+d.getMethodName();
            System.out.println("finished: "+caseIdentifiler);
        }
    };
    private String userName;
    private String pwd;

    public test1(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;


    }

    //参数化
    @Parameterized.Parameters
    public static Iterable<Object[]> setParam() {
        Object[][] objects = {{"neme1", "pwd1"}, {"neme2", "pwd2"}, {"neme2", "pwd2"}};
        return Arrays.asList(objects);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(methodName);
        System.out.println("test:");
        System.out.println("test:");
    }

    //执行Category这个注释的内容
    @Category(MokeTetst.class)
    @Test
    public void test1() {
        System.out.println("test:" + userName);
        System.out.println("test:" + pwd);
    }
}
