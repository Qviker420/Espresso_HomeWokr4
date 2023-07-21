package com.atiurin.sampleapp.ChattingTest.Pages

import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R

object UIElements {
    val radioVisibleButton = ViewMatchers.withId(R.id.radio_visible)
    val radioInvisibleButton = ViewMatchers.withId(R.id.radio_invisible)
    val radioGoneButton = ViewMatchers.withId(R.id.radio_gone)
}