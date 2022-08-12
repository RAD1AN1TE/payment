
interface PaymentService{

    fun returnStatus():String

}

class PaymentServiceImpl():PaymentService{
    override fun returnStatus():String {
        val rand = (0..1).random()
        return if(rand==0) "false"
        else "true"
    }

}