package com.elshafee.classd

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "",
            "123",
            "123"
        )
        assertThat(resualt).isFalse()
    }


    @Test
    fun `empty password returns false`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "bnin",
            "",
        ""
        )
        assertThat(resualt).isFalse()
    }
    @Test
    fun `password is not same as the confirmation returns false`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "bnin",
            "123",
        "1234"
        )
        assertThat(resualt).isFalse()
    }
    @Test
    fun `username already exsiting returns false`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "ahmad",
            "123",
        "123"
        )
        assertThat(resualt).isFalse()
    }
    @Test
    fun `password is less than 2 digits returns false`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "bnin",
            "1",
        "1"
        )
        assertThat(resualt).isFalse()
    }
    @Test
    fun `all data correct returns true`(){
        val resualt = RegistrationUtil.validatioRegistratioInput(
            "bnin",
            "123",
        "123"
        )
        assertThat(resualt).isTrue()
    }





}