package routes

import CommunicationApi
import PaymentService
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject


fun Application.paymentRoutes() {

    val service: PaymentService by inject()
    val communicationApi:CommunicationApi by inject()


    routing {
        route("/payment") {
            get("/status") {
                val status = service.returnStatus()
                communicationApi.postInventory()
                call.respond(status)
            }

        }
        route("/order"){
            get(){
                call.respond("true")
            }
        }
    }

}