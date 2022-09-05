class AndroidDeveloper : Employee(), Contract, NDA {
    override fun netSalary() {
        println("Your net salary is 20000 EGP")
    }

    override fun workingHours() {
        println("You have to work 40 hrs per week")
    }

    override fun daysOFF() {
        println("Your have 21 days off per year")
    }

    override fun benefits() {
        println("Your can get 20% benefits every year")
    }

    override fun bandNumberOne() {
        println("You have to come everyday at 8AM")
    }

    override fun bandNumberTwo() {
        println("you have to leave at 5 PM")
    }

    override fun bandNumberThree() {
        println("you have to Accept 3 month notice period")
    }

    override fun bandNumberFour() {
        println("you have to use your own CUP in the Kitchen")
    }

    override fun doNotLetAnyOneKnow() {
        println("if you passed the information,you will have to pay 50000EGP")
    }
}