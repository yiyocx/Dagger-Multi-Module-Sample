package com.example.core

interface ComponentFactory<T> {

    fun createComponent(): T
}