

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.jackson.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.koin.core.context.startKoin
import routes.paymentRoutes


fun main() {

    embeddedServer(factory = Netty, port = 8081, host = "0.0.0.0") {
        module()
    }.start(wait = true)

}

fun Application.module() {

    startKoin{
        modules(paymentModule)
    }

    install(ContentNegotiation){
        jackson {  }
    }

    paymentRoutes()

}




