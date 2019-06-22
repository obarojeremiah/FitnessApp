package fitness.fitz;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginActivityTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.field_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.field_email),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("lljere@"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.field_email), withText("lljere@"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.field_email), withText("lljere@"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.field_email), withText("lljere@"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("lljere@hhh"));

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText6.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText7.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText8.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText9.perform(click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText10.perform(click());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hhh"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText11.perform(replaceText("lljere@hotmail"));

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText12.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText13.perform(click());

        ViewInteraction appCompatEditText14 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText14.perform(click());

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText15.perform(replaceText("lljere@hotmail.co"));

        ViewInteraction appCompatEditText16 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail.co"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText16.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText17 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail.co"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText17.perform(click());

        ViewInteraction appCompatEditText18 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail.co"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText18.perform(replaceText("lljere@hotmail.com"));

        ViewInteraction appCompatEditText19 = onView(
                allOf(withId(R.id.field_email), withText("lljere@hotmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_email),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText19.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText20 = onView(
                allOf(withId(R.id.field_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_password),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText20.perform(replaceText("po"), closeSoftKeyboard());

        ViewInteraction appCompatEditText21 = onView(
                allOf(withId(R.id.field_password), withText("po"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_password),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText21.perform(click());

        ViewInteraction appCompatEditText22 = onView(
                allOf(withId(R.id.field_password), withText("po"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_password),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText22.perform(replaceText("popopo"));

        ViewInteraction appCompatEditText23 = onView(
                allOf(withId(R.id.field_password), withText("popopo"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.input_layout_password),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText23.perform(closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.email_create_account_button), withText("Sign Up"),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(R.id.main_layout),
                                                2)),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction polygonImageView = onView(
                allOf(withId(R.id.polygonFood),
                        childAtPosition(
                                allOf(withId(R.id.none),
                                        childAtPosition(
                                                withId(R.id.view_stub),
                                                0)),
                                7),
                        isDisplayed()));
        polygonImageView.perform(click());

        ViewInteraction polygonImageView2 = onView(
                allOf(withId(R.id.polygonFood),
                        childAtPosition(
                                allOf(withId(R.id.none),
                                        childAtPosition(
                                                withId(R.id.view_stub),
                                                0)),
                                7),
                        isDisplayed()));
        polygonImageView2.perform(click());

        ViewInteraction stickySwitch = onView(
                allOf(withId(R.id.sticky_switch_gender), withText("Male"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        stickySwitch.perform(click());


    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
