package org.rarible.tezos

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import com.rarible.protocol.tezos.api.util.tzkt.db.TzKTDBClient
import org.rarible.tezos.indexer.api.NotFoundException
import com.rarible.protocol.tezos.api.controller.V01ApiController
import org.springframework.boot.test.context.SpringBootTest
import java.math.BigDecimal

@SpringBootTest
class TezosIndexerGetBalanceTests {

    val dbClient: TzKTDBClient = TzKTDBClient()

    @Test
    fun contextLoads() {
    }

    /**
     * ********************
     * Get FT Balance tests
     * ********************
     */
    @Test
    fun getFA1FTBalanceWithExistingBalanceTest() {
        val apiController = V01ApiController()
        val result = apiController.ftBalance(
            "KT1G1cCRNBgQ48mVDjopHjEmTN5Sbtar8nn9",
            "tz1burnburnburnburnburnburnburjAYjjX",
            null
        )
		assert(result.statusCode.is2xxSuccessful)
		assert(result.body!!.balance >= BigDecimal(0))
	}

    @Test
    fun getFA1FTBalanceWithNonExistingBalanceTest() {
        val apiController = V01ApiController()
        assertThrows<NotFoundException> {
            apiController.ftBalance(
                "KT1G1cCRNBgQ48mVDjopHjEmTN5Sbtar89n9",
                "tz2LDByTzkpt7qBubspfyYiLYs6aKd321ztV",
                null
            )
        }
	}

    @Test
    fun getFA1FTBalanceWithWrongContractTest() {
        val apiController = V01ApiController()
        assertThrows<NotFoundException> {
            apiController.ftBalance(
				"KT1XXXXXXXn9",
				"tz2LDByTzkpt7qBubspfyYiLYs6aKd321ztV",
				null
			)
        }
    }

    @Test
    fun getFA1FTBalanceWithWrongAddressTest() {
        val apiController = V01ApiController()
        val result = apiController.ftBalance(
            "KT1G1cCRNBgQ48mVDjopHjEmTN5Sbtar8nn9",
            "tz2LDByTzkpt7qBubspiLYs6aKd321ztXXX",
            null
        )
        assert(result.statusCode.is2xxSuccessful)
        assert(result.body!!.balance >= BigDecimal(0))

    }

    @Test
    fun getFA2FTBalanceWithExistingBalanceTest() {
        val apiController = V01ApiController()
        val result = apiController.ftBalance("KT1JBNFcB5tiycHNdYGYCtR3kk6JaJysUCi8", "tz2LDByTzkpt7qBubspfyYiLYs6aKd321ztV", "0")
		assert(result.statusCode.is2xxSuccessful)
		assert(result.body!!.balance >= BigDecimal(0))
	}

    @Test
    fun getFA2FTBalanceWithNonExistingBalanceTest() {
        val apiController = V01ApiController()
        val result = apiController.ftBalance(
                "KT1JBNFcB5tiycHNdYGYCtR3kk6JaJysUCi8",
                "tz1burnburnburnburnburnburnburjAYjjX",
                "0"
            )
        assert(result.statusCode.is2xxSuccessful)
        assert(result.body!!.balance >= BigDecimal(0))
	}

	@Test
	fun getFA2FTBalanceWithWrongTokenIdTest() {
		val apiController = V01ApiController()
		assertThrows<NotFoundException> {
			apiController.ftBalance(
				"KT1G1cCRNBgQ48mVDjopHjEmTN5Sbtar8nn9",
				"tz2LDByTzkpt7qBubspiLYs6aKd321ztXXX",
				"X"
			)
		}
	}

	@Test
	fun getFA2FTBalanceWithNonExistingTokenIdTest() {
		val apiController = V01ApiController()
        assertThrows<NotFoundException> {
            apiController.ftBalance(
                "KT1G1cCRNBgQ48mVDjopHjEmTN5Sbtar8nn9",
                "tz2LDByTzkpt7qBubspfyYiLYs6aKd321ztV",
                "1"
            )
        }
	}

}
