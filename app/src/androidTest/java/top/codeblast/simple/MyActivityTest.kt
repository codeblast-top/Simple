package top.codeblast.simple

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.unit.dp
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import top.codeblast.simple.theme.MyApplicationTheme

/**
 * It might be better to set the content description instead of using testTag
 * see https://proandroiddev.com/stop-using-test-tags-in-the-jetpack-compose-production-code-b98e2679221f
 */
class MyActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setup() {
        composeTestRule.setContent {
            val innerPadding = PaddingValues(start = 0.0.dp, top = 24.0.dp, end = 0.0.dp, bottom = 24.0.dp)

            MyApplicationTheme {
                Greeting(
                    name = "Android", modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }

    @Test
    fun myTest() {
        composeTestRule.onNodeWithTag("Greeting").assertExists()
    }

//    @Test
//    fun addition_isNoCorrect() {
//        Assert.fail()
//    }
}