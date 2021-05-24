package com.bagusprasetyoadji.mysimplecleanarchitecture.data

import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}