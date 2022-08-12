import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.logging.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.jackson.*

object Http {
    val client = HttpClient(CIO){
        install(ContentNegotiation){
            jackson{}
        }
//        install(Logging){
//            level = LogLevel.INFO
//        }
    }
}
