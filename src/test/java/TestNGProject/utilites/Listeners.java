package TestNGProject.utilites;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Listeners implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {
    @Override
    public void onStart(ITestContext context) {//@BeforeClass gibi
        System.out.println("onStart Methodu -> Tüm testlerden önce tek bir sefer çağrılır "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish Methodu -> Tüm testlerden sonra tek bir sefer çağrılır "+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {//@BeforeMethod gibi
        System.out.println("onTestStart Methodu -> Her bir test'ten önce tek bir sefer çağrılır "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Methodu -> PASSED olan testlerden sonra tek bir sefer çağrılır "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Methodu -> FAILED olan testlerden sonra tek bir sefer çağrılır "+result.getName());
        ReusableMethods.tumSayfaResmi(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Methodu -> SKIP(atlanan) olan testlerden sonra tek bir sefer çağrılır "+result.getName());
    }

    private static int retryCount = 0;
    private static final int maxRetryCount = 1;
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
        /*
        Bu method sadece FAIL olan test case'leri tekrar çalıştırır
        maxRetryCount ek olarak çalisma sayısıdır. Bu örnekte Fail olan test (maxRetryCount = 1) normal bir kere
        çalıştıktan sonra fail olursa 1 kez daha çalışacaktır.
         */

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        /*
            Bu methodun amacı; test notasyonlarını, sınıfları, cons.ları ve methodları transform(dönüştürme) etmemize
        olanak sağlar
            Bu method sayesinde @Test annotation a sahip methodları yapılandırıp testin başarısız olma durumunda
            otomatik olarak testleri retry methodunda belirttiğimiz sayı miktarınca tekrar çalıştıracaktır.
         */
        annotation.setRetryAnalyzer(Listeners.class);
    }
}
