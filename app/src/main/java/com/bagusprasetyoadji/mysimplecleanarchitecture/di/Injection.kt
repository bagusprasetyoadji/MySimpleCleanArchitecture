package com.bagusprasetyoadji.mysimplecleanarchitecture.di

import com.bagusprasetyoadji.mysimplecleanarchitecture.data.IMessageDataSource
import com.bagusprasetyoadji.mysimplecleanarchitecture.data.MessageDataSource
import com.bagusprasetyoadji.mysimplecleanarchitecture.data.MessageRepository
import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.IMessageRepository
import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.MessageInteractor
import com.bagusprasetyoadji.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}