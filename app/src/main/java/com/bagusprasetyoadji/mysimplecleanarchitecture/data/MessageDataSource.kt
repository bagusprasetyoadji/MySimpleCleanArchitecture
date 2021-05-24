package com.bagusprasetyoadji.mysimplecleanarchitecture.data

import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}