package com.atiurin.sampleapp.ChattingTest.Test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.ChattingTest.Steps.StepUIElements
import com.atiurin.sampleapp.ChattingTest.Steps.Steps
import com.atiurin.sampleapp.activity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriend() {
        with(Steps) {
            checkDashboard();
            openChat("Rachel Green");
            sendText("How U doin");
        }
    }
    @Test
    fun mainMenu() {
        with(Steps) {
            checkDashboard()
            goToMenu()
            goToUiElements()
        }
        with(StepUIElements)
        {
            checkElementOne()
            checkElementTwo()
        }
    }
}