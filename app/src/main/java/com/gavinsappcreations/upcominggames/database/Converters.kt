package com.gavinsappcreations.upcominggames.database

import androidx.room.TypeConverter


class Converters {

    @TypeConverter
    fun listToString(list: List<String>?): String {

        if (list == null) {
            return "no platforms"
        }

        //TODO: this is causing a trailing comma in platforms list

        val stringBuilder = StringBuilder()
        for (item in list) {
            stringBuilder.append(item).append(",")
        }
        return stringBuilder.toString()
    }

    @TypeConverter
    fun stringToList(string: String): List<String> {
        return string.substring(0, string.length - 1).split(",")
    }
}