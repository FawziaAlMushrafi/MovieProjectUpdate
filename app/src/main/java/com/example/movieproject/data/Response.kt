package com.example.movieproject.data

import com.squareup.moshi.Json


data class Response(

    @Json(name="page")
    val page: Int? = null,

    @Json(name="total_pages")
    val totalPages: Int? = null,

    @Json(name="results")
    val results: List<ResultsItem>? = null,

    @Json(name="total_results")
    val totalResults: Int? = null
)