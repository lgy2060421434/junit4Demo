import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//Suite是Categories的父类
@Categories.SuiteClasses({
//        test.class,
        test1.class
})
//这是只执行 @Category注释的
//@Categories.IncludeCategory(MokeTetst.class)
//这是只执行@Category注释的相反的
@Categories.ExcludeCategory(MokeTetst.class)
public class suit {
}
