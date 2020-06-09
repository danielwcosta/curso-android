package com.example.entregavel_marvel.repository

import com.example.entregavel_marvel.model.ComicResponse
import com.example.entregavel_marvel.network.RetrofitInit
import com.example.entregavel_marvel.network.ServiceMarvel
import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class RepositoryMarvel {

    private var url = "https://gateway.marvel.com/v1/public/"
    private var service = ServiceMarvel::class
    private val PRIVATE_KEY = "ceac13aef2089eaf3c704ba9da60cf2156b60912"
    private val PUBLIC_KEY = "fe81c0a4bd6c7f00e3df25d68d8d8a92"
    private var ts = (System.currentTimeMillis() / 1000).toString()
    private val hash = getMd5(ts)
    private val limit =30


    private val serviceMarvel = RetrofitInit(url).create(service)

    suspend fun getComicService(): ComicResponse = serviceMarvel.getComic(limit,ts, hash,
        PUBLIC_KEY
    )

    private fun getMd5(ts: String): String {
        try {
            val messageDigest = MessageDigest.getInstance(MD5).digest(
                ts.toByteArray() + PRIVATE_KEY.toByteArray() + PUBLIC_KEY.toByteArray()
            )
            var hashText = BigInteger(SIGNUM_1, messageDigest).toString(RADIX)
            while (hashText.length < HASH_TEXT_LENGTH) {
                hashText = "0$hashText"
            }
            return hashText
        } catch (e: NoSuchAlgorithmException) {
            throw RuntimeException(e)
        }
    }
    companion object {
        private const val MD5 = "MD5"
        private const val SIGNUM_1 = 1
        private const val RADIX = 16
        private const val HASH_TEXT_LENGTH = 32
    }
}
