package com.rarible.protocol.tezos.api.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid

/**
 *
 * @param atType
 * @param types
 */
data class OrderActivityFilterAll(

    @field:JsonProperty("@type", required = true) val atType: OrderActivityFilterAll.AtType,

    @field:Valid
    @field:JsonProperty("types", required = true) val types: kotlin.collections.List<OrderActivityFilterAllType>
) {

    /**
    *
    * Values: all
    */
    enum class AtType(val value: String) {

        @JsonProperty("all") all("all");

    }

}

