package com.example.entregavel_marvel.util

import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class GeraHash {
     fun getMd5(ts: String): String {
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
        private const val PUBLIC_KEY = "6eb7e8896ec5850c52515a8a23ee97f0"
        private const val PRIVATE_KEY = "0dd0c16fedb8a02985977eafca66b49f5e6a526f"
        private const val MD5 = "MD5"
        private const val SIGNUM_1 = 1
        private const val RADIX = 16
        private const val HASH_TEXT_LENGTH = 32
    }
}