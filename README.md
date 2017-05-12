![Maven Central](https://avatars1.githubusercontent.com/u/14217797?v=3&u=f7438004056c53d618a481884aec5f21d4b622b3&s=50)
> www.agustingandara.com

Introduction
------------
This is a **SIMPLE MVP-CLEAN KOTLIN** sample of **Rosie** Implementation Architecture! 

This sample includes Application + Activity + Fragment + UseCase + Repository

MVP Clean
------------
Rosie is an Android framework to create applications following the principles of [Clean Architecture][clean].
Rosie divides your application in three layers, **view**, **domain** and **repository**. 

* **View**: It contains all your presentation logic, implemented through the [Model-View-Presenter pattern][mvp]. Rosie provides classes to represent the main components of this layer like ``RosieActivity``, ``RosieFragment`` or ``RosiePresenter``.
* **Domain**: Holding all your business logic, its main component is ``RosieUseCase`` that gives you an easy way to define your application use cases and execute them in a background thread using the [command pattern][com].
* **Repository**: This layer gives you an abstraction of how to retrieve and store data in your application following the [Repository pattern][rep]. ``RosieRepository`` and the multiple ``DataSource`` classes gives you the base to start building your own repositories.

Dependencies
------------
* **Android**: Support + AppCompat + Design
* **Connection**: Retrofit + OkHttp 
* **Gson**: Json Reflection + RetrofitConverter
* **Image**: Glide + Loader + Downloader
* **Dialogs**: Material Dialogs 
* **RxJava**: Reactive + AndroidExtras 
* **RxBluetooth**: ReactiveBLE
* **Architecture**: Rosie
* **Syntax**: KotlinLang
* **Injetion**: DaggerDependencies + KotlinCompat
