package com.daon.translator.repository

import com.daon.translator.data.datasource.MainDataSource
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val mainDataSource: MainDataSource
){
    fun getPapagoTranslationText(text : String, source : String, target : String) = mainDataSource.getPapagoTranslationText(text = text, source = source, target = target)
}