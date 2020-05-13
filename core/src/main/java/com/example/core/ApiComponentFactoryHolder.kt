package com.example.core

object ApiComponentFactoryHolder {

    private val daggerApiComponents: MutableMap<Class<*>, ComponentFactory<*>> = hashMapOf()

    fun <E> addComponentFactory(key: Class<E>, componentFactory: ComponentFactory<E>) {
        daggerApiComponents[key] = componentFactory
    }

    fun <E> getComponent(key: Class<E>): ComponentFactory<E> {
        return daggerApiComponents[key] as? ComponentFactory<E> ?: throw Exception()
    }

    inline fun <reified E> register(factory: ComponentFactory<E>) {
        addComponentFactory(E::class.java, factory)
    }
}