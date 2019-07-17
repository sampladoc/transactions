package jobbleapi

class HomeController {

    def index() {
        respond([name: session.name ?: 'User', transactionTotal: Transaction.count()]) 
    }

    def updateName(String name) {
        session.name = name 

        flash.message = "Name has been updated" 

        redirect action: 'index' 
    }
}
