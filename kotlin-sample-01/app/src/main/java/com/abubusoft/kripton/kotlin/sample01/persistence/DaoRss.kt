package com.abubusoft.kripton.kotlin.sample01.persistence


import com.abubusoft.kripton.android.annotation.BindDao
import com.abubusoft.kripton.android.annotation.BindSqlSelect
import com.abubusoft.kripton.kotlin.sample01.model.RssFeed

@BindDao(RssFeed::class)
interface DaoRss : DaoBase<RssFeed> {

    @BindSqlSelect(where = "uid=:uid")
    fun selectOne(uid: String): RssFeed

}