package jobbleapi

class BootStrap {

    def init = { servletContext ->
        def request = new Type(name: 'request').save()
        def transfered = new Type(name: 'transfered').save()
        def accepted = new Type(name: 'accepted').save()


        new Transaction(name: 'Lorenzo Olliver',  type: request, amount: 1000).save()
        
    }
    def destroy = {
    }
}
