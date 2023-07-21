package com.atiurin.sampleapp.ChattingTest.Steps

import com.atiurin.sampleapp.ChattingTest.Pages.FriendsAppMatchers
import com.atiurin.sampleapp.ChattingTest.Pages.UIElements
import com.atiurin.sampleapp.helper.isViewDisplayed

object StepUIElements {
    fun checkElementOne()
    {
        with(UIElements)
        {
            radioVisibleButton.isViewDisplayed();
        }
    }
    fun checkElementTwo()
    {
        with(UIElements)
        {
            radioInvisibleButton.isViewDisplayed()
        }
    }
}