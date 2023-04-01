package com.daon.translator.data.api

import com.daon.translator.data.model.request.PapagoTranslationRequest
import com.daon.translator.data.model.response.PapagoTranslationResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface PapagoApi {
    @POST("/v1/papago/n2mt")
    fun papagoTranslationService(
        @Header("X-Naver-Client-Id") X_Naver_Client_Id : String,
        @Header("X-Naver-Client-Secret") X_Naver_Client_Secret : String,
        @Body papagoTranslationRequest : PapagoTranslationRequest
    ) : Single<PapagoTranslationResponse>
}