import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.*
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL
import java.time.Duration

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

    private lateinit var driver: AndroidDriver

    @BeforeAll
    fun setup() {
        val options = UiAutomator2Options()

        val serverUrl = URL("http://localhost:4723")
        driver = AndroidDriver(serverUrl, options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
    }

    @Test
    fun simpleTest() {
//        val element = driver.findElementByAccessibilityId("YourElementID")  // Replace with actual ID
//        element.click()
        Thread.sleep(10_000)
        // Add your test steps here
    }

    @AfterAll
    fun tearDown() {
        driver.quit()
    }
}
