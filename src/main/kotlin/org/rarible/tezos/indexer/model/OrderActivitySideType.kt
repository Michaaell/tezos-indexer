package org.rarible.tezos.indexer.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
* 
* Values: sELL,bID
*/
enum class OrderActivitySideType(val value: kotlin.String) {

    @JsonProperty("SELL") sELL("SELL"),

    @JsonProperty("BID") bID("BID");

}

