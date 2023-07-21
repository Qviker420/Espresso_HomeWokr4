package com.atiurin.sampleapp.ChattingTest.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MenuMatcher {
    val manuItem: Matcher<View> by lazy { withId(R.id.ui_elements) }
}