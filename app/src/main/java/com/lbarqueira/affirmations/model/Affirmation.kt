package com.lbarqueira.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// 1 - Create the Affirmation data class
// data classes must have at least one property defined
// When you create an instance of Affirmation, you need to pass in the resource ID
// for the affirmation string. The resource ID is an integer.
// Annotations are useful because they add additional info to classes, methods, or parameters.
// Annotations are always declared with an @ symbol.
// In this case, add the @StringRes annotation to your string resource ID property
// and @DrawableRes annotation to your drawable resource ID property.

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)