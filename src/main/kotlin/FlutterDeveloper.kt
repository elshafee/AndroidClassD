class FlutterDeveloper : Employee(),Contract,NDA {
    override fun netSalary() {
        println("Your net salary is 15000 EGP")
    }

    override fun workingHours() {
        println("You have to work 30 hrs per week")
    }

    override fun daysOFF() {
        println("You have 25 days off per year")
    }

    override fun benefits() {
        println("You can get 15% benefits every year on your salary")
    }

    override fun bandNumberOne() {
        super<NDA>.bandNumberOne()
        println("SUPER CLASS")
    }

    override fun bandNumberTwo() {
        TODO("Not yet implemented")
    }

    override fun bandNumberThree() {
        TODO("Not yet implemented")
    }

    override fun bandNumberFour() {
        TODO("Not yet implemented")
    }

    override fun doNotLetAnyOneKnow() {
        TODO("Not yet implemented")
    }
}