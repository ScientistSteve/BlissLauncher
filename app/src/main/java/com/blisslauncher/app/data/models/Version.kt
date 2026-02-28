package com.blisslauncher.app.data.models

import java.util.Date

data class Version(
    val id: String,
    val name: String,
    val releaseDate: Date,
    val isLatest: Boolean
)