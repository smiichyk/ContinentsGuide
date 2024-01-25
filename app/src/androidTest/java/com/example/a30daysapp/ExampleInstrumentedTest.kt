package com.example.a30daysapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.screens.ShowAfrica
import com.example.a30daysapp.screens.ShowAmerica
import com.example.a30daysapp.screens.ShowAsia
import com.example.a30daysapp.screens.ShowEurope
import com.example.a30daysapp.screens.ShowMainButtons
import com.example.a30daysapp.screens.ShowOceania
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun mainButtonsTest() {
        // Test the ShowMainButtons function
        composeTestRule.setContent {
            ShowMainButtons(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("EUROPE", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun europeScreenTest() {
        // Test the ShowEurope function
        composeTestRule.setContent {
            ShowEurope(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("This is the Europe screen content.", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun asiaScreenTest() {
        // Test the ShowAsia function
        composeTestRule.setContent {
            ShowAsia(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("This is the Asia screen content.", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun africaScreenTest() {
        // Test the ShowAfrica function
        composeTestRule.setContent {
            ShowAfrica(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("This is the Africa screen content.", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun americaScreenTest() {
        // Test the ShowAmerica function
        composeTestRule.setContent {
            ShowAmerica(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("This is the America screen content.", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun oceaniaScreenTest() {
        // Test the ShowOceania function
        composeTestRule.setContent {
            ShowOceania(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("This is the Oceania screen content.", useUnmergedTree = true)
            .assertExists()
    }
}