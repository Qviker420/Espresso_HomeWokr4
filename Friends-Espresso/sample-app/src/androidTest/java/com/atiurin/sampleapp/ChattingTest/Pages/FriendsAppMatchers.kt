package com.atiurin.sampleapp.ChattingTest.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.getText
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FriendsAppMatchers {
    val toolBar: Matcher<View> by lazy { withId(R.id.toolbar) }
    val textInput: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val toolbarTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val menuBtn: Matcher<View> by lazy { withId(R.id.toolbar) }

    fun getFriend(name: String): Matcher<View> {
        val friend: Matcher<View> by lazy { Matchers.allOf(withId(R.id.tv_name), withText(name)) }
        return friend
    }

    fun textSent(text: String): String {
        val textMassege: Matcher<View> by lazy {
            Matchers.allOf(
                withId(R.id.message_text),
                withText(text)
            )
        }
        return textMassege.getText();
    }
}