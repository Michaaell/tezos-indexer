package org.rarible.tezos.indexer.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid

/**
 * 
 * @param orders 
 * @param continuation 
 */
data class OrderPagination(

    @field:Valid
    @field:JsonProperty("orders", required = true) val orders: kotlin.collections.List<Order>,

    @field:JsonProperty("continuation") val continuation: kotlin.String? = null
) {

}

