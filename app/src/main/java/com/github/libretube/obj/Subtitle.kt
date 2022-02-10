package com.github.libretube.obj

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Subtitle(
    val url: String?,
    val mimeType: String?,
    val name: String?,
    val code: String?,
    val autoGenerated: Boolean?
){
    constructor(): this("","","","",null)
}