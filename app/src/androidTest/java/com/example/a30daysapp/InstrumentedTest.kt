package com.example.a30daysapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.quizes.AfricaQuiz
import com.example.a30daysapp.quizes.AmericaQuiz
import com.example.a30daysapp.quizes.AsiaQuiz
import com.example.a30daysapp.quizes.EuropeQuiz
import com.example.a30daysapp.quizes.OceaniaQuiz
import com.example.a30daysapp.screens.AfricaScreen
import com.example.a30daysapp.screens.AmericaScreen
import com.example.a30daysapp.screens.AsiaScreen
import com.example.a30daysapp.screens.EuropeScreen
import com.example.a30daysapp.screens.OceaniaScreen
import com.example.a30daysapp.screens.ShowMainButtons
import com.example.a30daysapp.ui.theme.ContinentsGuide
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun mainMenuTextTest() {
        composeTestRule.setContent {
            ShowMainButtons(rememberNavController())
        }
        composeTestRule
            .onNodeWithText("EUROPE", useUnmergedTree = true)
            .assertExists()
        composeTestRule
            .onNodeWithText("ASIA", useUnmergedTree = true)
            .assertExists()
        composeTestRule
            .onNodeWithText("AFRICA", useUnmergedTree = true)
            .assertExists()
        composeTestRule
            .onNodeWithText("NORTH AND SOUTH AMERICA", useUnmergedTree = true)
            .assertExists()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun testNavigationEurope() {
        val expectedText = "Europe is a continent in the Western Hemisphere, bordered by the Atlantic Ocean to the west, the Arctic Ocean to the north, and the Black, Caspian, and Mediterranean Seas to the south. It consists of 44 countries and boasts diverse climates, cultures, and histories. The European Union is a significant political and economic force, uniting 27 countries. Europe is a center of global history, art, science, and economics. Capitals such as Paris, Berlin, London, Rome, and Madrid are cultural and economic hubs of the world."
        composeTestRule
            .setContent {
            ContinentsGuide {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main_screen") {
                    composable(Screen.MainMenu.route) {
                        ShowMainButtons(navController)
                    }
                    composable(Screen.Europe.route) {
                        EuropeScreen(navController)
                    }
                    composable(Screen.EuropeQuiz.route) {
                        EuropeQuiz(navController)
                    }
                }
            }
        }
        composeTestRule
            .onNodeWithText("EUROPE")
            .performClick()
        composeTestRule
            .onNodeWithText(expectedText)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithText("QUIZ")
            .assertIsDisplayed()
            .performClick()
        composeTestRule
            .onNodeWithText("Which country is the birthplace of ancient democracy?")
            .assertExists()
        composeTestRule
            .onNodeWithText("SUBMIT")
            .assertExists()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("EUROPE")
            .assertExists()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .assertExists()
    }

    @Test
    fun testNavigationAsia() {
        val expectedText = "Asia, the largest continent, spans the Eastern Hemisphere, bordered by the Pacific Ocean to the east, the Indian Ocean to the south, and the Arctic Ocean to the north. It encompasses diverse landscapes, from the vast deserts of the Middle East to the lush rain forests of Southeast Asia. With 49 countries, Asia boasts a rich tapestry of cultures, languages, and traditions. The continent is a hub of economic activity, with dynamic industries driving global commerce. Organizations like the Association of Southeast Asian Nations (ASEAN) foster regional cooperation. Major cities such as Tokyo, Beijing, Delhi, and Istanbul are vibrant centers of innovation and culture."
        composeTestRule
            .setContent {
                ContinentsGuide {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main_screen") {
                        composable(Screen.MainMenu.route) {
                            ShowMainButtons(navController)
                        }
                        composable(Screen.Asia.route) {
                            AsiaScreen(navController)
                        }
                        composable(Screen.AsiaQuiz.route) {
                            AsiaQuiz(navController)
                        }
                    }
                }
            }
        composeTestRule
            .onNodeWithText("ASIA")
            .performClick()
        composeTestRule
            .onNodeWithText(expectedText)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithText("QUIZ")
            .assertIsDisplayed()
            .performClick()
        composeTestRule
            .onNodeWithText("Which river is considered the cradle of Chinese civilization?")
            .assertExists()
        composeTestRule
            .onNodeWithText("SUBMIT")
            .assertExists()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("ASIA")
            .assertExists()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .assertExists()
    }

    @Test
    fun testNavigationAfrica() {
        val expectedText = "Africa is a continent located primarily in the Eastern Hemisphere, bounded by the Atlantic Ocean to the west, the Indian Ocean to the east, and the Mediterranean Sea to the north. It comprises 54 countries and exhibits a rich diversity of cultures, landscapes, and histories. Africa's natural beauty encompasses deserts, savannas, forests, and mountains. Despite challenges, it holds immense potential for growth and development. The African Union serves as a pivotal organization for continental cooperation and integration. Major cities such as Cairo, Lagos, Johannesburg, Nairobi, and Addis Ababa are important centers for culture, commerce, and innovation on the continent."
        composeTestRule
            .setContent {
                ContinentsGuide {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main_screen") {
                        composable(Screen.MainMenu.route) {
                            ShowMainButtons(navController)
                        }
                        composable(Screen.Africa.route) {
                            AfricaScreen(navController)
                        }
                        composable(Screen.AfricaQuiz.route) {
                            AfricaQuiz(navController)
                        }
                    }
                }
            }
        composeTestRule
            .onNodeWithText("AFRICA")
            .performClick()
        composeTestRule
            .onNodeWithText(expectedText)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithText("QUIZ")
            .assertIsDisplayed()
            .performClick()
        composeTestRule
            .onNodeWithText("Which river is the longest in Africa?")
            .assertExists()
        composeTestRule
            .onNodeWithText("SUBMIT")
            .assertExists()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("AFRICA")
            .assertExists()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .assertExists()
    }

    @Test
    fun testNavigationAmerica() {
        val expectedText = "America, comprising North and South America, is a vast continent located primarily in the Western Hemisphere, bordered by the Pacific Ocean to the west, the Atlantic Ocean to the east, and the Arctic Ocean to the north. It showcases a remarkable diversity of landscapes, including mountains, forests, deserts, and tropical rainforests. With 35 countries, America is a melting pot of cultures, languages, and traditions. The continent boasts significant economic powerhouses and technological innovation."
        composeTestRule
            .setContent {
                ContinentsGuide {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main_screen") {
                        composable(Screen.MainMenu.route) {
                            ShowMainButtons(navController)
                        }
                        composable(Screen.America.route) {
                            AmericaScreen(navController)
                        }
                        composable(Screen.AmericaQuiz.route) {
                            AmericaQuiz(navController)
                        }
                    }
                }
            }
        composeTestRule
            .onNodeWithText("NORTH AND SOUTH AMERICA")
            .performClick()
        composeTestRule
            .onNodeWithText(expectedText)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithText("QUIZ")
            .assertIsDisplayed()
            .performClick()
        composeTestRule
            .onNodeWithText("Which river is the longest in South America?")
            .assertExists()
        composeTestRule
            .onNodeWithText("SUBMIT")
            .assertExists()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("NORTH AND SOUTH AMERICA")
            .assertExists()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .assertExists()
    }

    @Test
    fun testNavigationOceania() {
        val expectedText = "Oceania is a geographical region consisting of thousands of islands located in the central and southern parts of the Pacific Ocean. It includes island groups such as Australia, New Zealand, Hawaii, and the islands of Polynesia, Micronesia, and Melanesia. Oceania is characterized by rich biodiversity, including tropical forests, coral reefs, and unique animal species. The diversity of cultures and languages reflects the multitude of ethnic groups inhabiting these islands. The region holds strategic importance for international trade and cooperation and is home to many indigenous peoples who continue to preserve their traditions and customs."
        composeTestRule
            .setContent {
                ContinentsGuide {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main_screen") {
                        composable(Screen.MainMenu.route) {
                            ShowMainButtons(navController)
                        }
                        composable(Screen.Oceania.route) {
                            OceaniaScreen(navController)
                        }
                        composable(Screen.OceaniaQuiz.route) {
                            OceaniaQuiz(navController)
                        }
                    }
                }
            }
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .performClick()
        composeTestRule
            .onNodeWithText(expectedText)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithText("QUIZ")
            .assertIsDisplayed()
            .performClick()
        composeTestRule
            .onNodeWithText("Which country is home to the Great Barrier Reef?")
            .assertExists()
        composeTestRule
            .onNodeWithText("SUBMIT")
            .assertExists()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("BACK")
            .performClick()
        composeTestRule
            .onNodeWithText("OCEANIA AND MORE EXOTIC COUNTRIES")
            .assertExists()
        composeTestRule
            .onNodeWithText("EUROPE")
            .assertExists()
    }
}