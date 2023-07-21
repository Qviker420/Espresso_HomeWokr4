package com.atiurin.sampleapp.ChattingTest.Steps

import com.atiurin.sampleapp.ChattingTest.Pages.FriendsAppMatchers
import com.atiurin.sampleapp.ChattingTest.Pages.MenuMatcher
import com.atiurin.sampleapp.helper.getText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.helper.waitForView
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object Steps {
    fun checkDashboard()
    {
        with(FriendsAppMatchers)
        {
            toolBar.isViewDisplayed();
        }
    }
    fun openChat(name: String)
    {
        with(FriendsAppMatchers)
        {
            getFriend(name).tap()
            Assert.assertEquals(name, toolbarTitle.getText())
        }
    }
    fun sendText(text:String)
    {
        with(FriendsAppMatchers)
        {
            textInput.tap()
            textInput.typeText(text)
            Assert.assertEquals(textSent(text), text)
        }
    }
    fun goToMenu()
    {
        with(FriendsAppMatchers)
        {
            menuBtn.tap();
        }
    }
    fun goToUiElements()
    {
        with(MenuMatcher)
        {
            manuItem.tap()
        }
    }

}