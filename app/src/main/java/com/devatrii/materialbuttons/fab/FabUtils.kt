package com.devatrii.materialbuttons.fab

import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.math.abs

//=> Made by Dev Atrii on 17 Nov 2023

private const val THRESHOLD = 30

fun NestedScrollView.hideFabOnScroll(
    vararg fabs: FloatingActionButton,
    threshold: Int = THRESHOLD,
) {
    setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isShown)
                    fab.hide()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isShown)
                    fab.show()
            }
        }

    })
}

fun NestedScrollView.hideFabOnScroll(
    vararg fabs: ExtendedFloatingActionButton,
    threshold: Int = THRESHOLD
) {
    setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isShown)
                    fab.hide()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isShown)
                    fab.show()
            }
        }

    })
}

fun NestedScrollView.shrinkFabOnScroll(
    vararg fabs: ExtendedFloatingActionButton,
    threshold: Int = THRESHOLD
) {
    setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isExtended)
                    fab.shrink()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isExtended)
                    fab.extend()
            }
        }

    })
}

// recycler view

fun RecyclerView.hideFabOnScroll(
    vararg fabs: FloatingActionButton,
    threshold: Int = THRESHOLD,
) {
    setOnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isShown)
                    fab.hide()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isShown)
                    fab.show()
            }
        }
    }
}

fun RecyclerView.hideFabOnScroll(
    vararg fabs: ExtendedFloatingActionButton,
    threshold: Int = THRESHOLD
) {
    setOnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isShown)
                    fab.hide()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isShown)
                    fab.show()
            }
        }

    }
}

fun RecyclerView.shrinkFabOnScroll(
    vararg fabs: ExtendedFloatingActionButton,
    threshold: Int = THRESHOLD
) {
    setOnScrollChangeListener { _, _, scrollY, _, oldScrollY ->
        val difference = abs(scrollY - oldScrollY)
        if (scrollY > oldScrollY && difference >= threshold) {
            // scrolling down
            fabs.forEach { fab ->
                if (fab.isExtended)
                    fab.shrink()
            }
        } else if (difference >= threshold) {
            // scrolling up
            fabs.forEach { fab ->
                if (!fab.isExtended)
                    fab.extend()
            }
        }

    }
}