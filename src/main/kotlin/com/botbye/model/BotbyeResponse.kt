package com.botbye.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

data class BotbyeError(
    @JsonProperty("message")
    val message: String,
)

data class BotbyeChallengeResult(
    @JsonProperty("isBot")
    val isBot: Boolean = false,
    @JsonProperty("banRequired")
    val banRequired: Boolean = false,
)

data class BotbyeResponse(
    val result: BotbyeChallengeResult? = BotbyeChallengeResult(),
    val reqId: UUID = UUID.fromString("00000000-0000-0000-0000-000000000000"),
    val error: BotbyeError? = null,
)
