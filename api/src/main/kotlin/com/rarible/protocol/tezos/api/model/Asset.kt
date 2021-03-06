package com.rarible.protocol.tezos.api.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid

/**
 *
 * @param assetType
 * @param &#x60;value&#x60;
 */
data class Asset(

    @field:Valid
    @field:JsonProperty("assetType", required = true) val assetType: com.rarible.protocol.tezos.api.model.AssetType,

    @field:Valid
    @field:JsonProperty("value", required = true) val `value`: java.math.BigDecimal
) {

}

