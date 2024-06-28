package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.akai, R.string.dog_name_1, 1000, R.string.dog_description_1),
    Dog(R.drawable.lolita, R.string.dog_name_2, 14, R.string.dog_description_2),
    Dog(R.drawable.franco, R.string.dog_name_3, 40, R.string.dog_description_3),
    Dog(R.drawable.minotaur, R.string.dog_name_4, 25, R.string.dog_description_4),
    Dog(R.drawable.johnson, R.string.dog_name_5, 30, R.string.dog_description_5),
    Dog(R.drawable.akai, R.string.dog_name_6, 24, R.string.dog_description_6),
    Dog(R.drawable.mathilda, R.string.dog_name_7, 19, R.string.dog_description_7),
    Dog(R.drawable.terizla, R.string.dog_name_8, 34, R.string.dog_description_8),
    Dog(R.drawable.chou, R.string.dog_name_9, 29, R.string.dog_description_9)
)
