package com.yetsdmr.calculatorcmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform