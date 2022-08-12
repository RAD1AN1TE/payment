import org.koin.dsl.module

val paymentModule = module{

    single{Http.client}

    single<CommunicationApi>{CommunicationApiImpl(get())}
    single<PaymentService>{PaymentServiceImpl()}

}