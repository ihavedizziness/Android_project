package com.example.diplomaproject.core.state

sealed class RegistrationState {

    data object Loading: RegistrationState()

    data class Failed(
        val message: String
    ): RegistrationState()

    data class Success(
        val message: String
    ): RegistrationState()

}