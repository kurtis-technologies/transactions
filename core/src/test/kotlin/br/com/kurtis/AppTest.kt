package br.com.kurtis

import junit.framework.Test
import junit.framework.TestCase
import junit.framework.TestSuite

class AppTest(testName: String) : TestCase(testName) {

    fun testApp() {
        assertTrue(true)
    }

    companion object {

        fun suite(): Test {
            return TestSuite(AppTest::class.java)
        }
    }
}
