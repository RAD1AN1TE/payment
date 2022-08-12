

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*


interface CommunicationApi{
    suspend fun postInventory()
}

data class Inventory (
    var item: String,
    var count: Int
)

class CommunicationApiImpl(private val client: HttpClient):CommunicationApi{



    override suspend fun postInventory() {

       client.post(urlString = "http://localhost:8080/v1/save"){
            contentType(ContentType.Application.Json)
            setBody(Inventory("pencil", 10))
        }

    }

}


