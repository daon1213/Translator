package com.daon.translator.data.datasource

import com.daon.translator.data.api.PapagoApi
import com.daon.translator.data.model.request.PapagoTranslationRequest
import com.daon.translator.widget.utils.Utils
import javax.inject.Inject

class MainDataSource @Inject constructor(
    private val papagoApi: PapagoApi
) {
    fun getPapagoTranslationText(text : String, source : String, target : String) = papagoApi.papagoTranslationService(
        Utils.X_NAVER_CLIENT_ID, Utils.X_NAVER_CLIENT_SECRET, PapagoTranslationRequest(source = source, target = target, text = text)
    )
}