package com.bagusprasetyoadji.mysimplecleanarchitecture.data

import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}