package com.example.imovie

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.imovie.activity.MainActivity
import com.example.imovie.utilities.MovieList
import com.example.imovie.utilities.TvShowsList
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    private val dummyMovies = MovieList.getMovieList()
    private val dummyTvShows = TvShowsList.getTvShowList()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        Espresso.onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.tv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_movie)).check(ViewAssertions.matches(withText(dummyMovies[0].movieName)))
        Espresso.onView(withId(R.id.tv_category))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_category)).check(ViewAssertions.matches(withText(dummyMovies[0].category)))
        Espresso.onView(withId(R.id.tv_rating))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_rating)).check(ViewAssertions.matches(withText(dummyMovies[0].rating.toString())))
        Espresso.onView(withId(R.id.tv_des))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_des)).check(ViewAssertions.matches(withText(dummyMovies[0].description)))
        Espresso.onView(withId(R.id.iv_poster))
            .check(ViewAssertions.matches(isDisplayed()))

    }

    @Test
    fun loadTvShows() {
        Espresso.onView(withText("Tv Show")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShows.size))
    }


    @Test
    fun loadDetailTvShow() {
        Espresso.onView(withText("Tv Show")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.tv_tvshows))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_tvshows)).check(ViewAssertions.matches(withText(dummyTvShows[0].tvShowsName)))
        Espresso.onView(withId(R.id.tv_category_tvshows))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_category_tvshows)).check(ViewAssertions.matches(withText(dummyTvShows[0].category)))
        Espresso.onView(withId(R.id.tv_rating_tv_shows))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_rating_tv_shows)).check(ViewAssertions.matches(withText(dummyTvShows[0].rating.toString())))
        Espresso.onView(withId(R.id.tv_des_tvshows))
            .check(ViewAssertions.matches(isDisplayed()))
        Espresso.onView(withId(R.id.tv_des_tvshows)).check(ViewAssertions.matches(withText(dummyTvShows[0].description)))
        Espresso.onView(withId(R.id.iv_tvshows))
            .check(ViewAssertions.matches(isDisplayed()))

    }
}