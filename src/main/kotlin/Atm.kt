import java.util.*
import kotlin.system.exitProcess

open class Atm {
    private var pinCode: Int = 0
    var nameOnCard: String = ""
    var balance: Float = 0f
    var selectedOption: Int = 0
    var money: Float = 0f

    fun enterYourCard() {
        println("Welcome to our CIB BANK ATM")
        println("Please enter your name ?!")
        nameOnCard = readLine().toString()
        println("Please enter your PIN CODE")
        pinCode = Integer.valueOf(readLine())
        println("Please insert the amount of Balance you have")
        balance = readLine()!!.toFloat()
        selectOperation()

    }

    fun selectOperation() {
        println("Please select your operation you need to proceed")
        println("1: For Deposit, 2: For Withdraw, 3: Check Balance, 4: Quit")
        selectedOption = Integer.valueOf(readLine())
        when (selectedOption) {
            1 -> deposit()
            2 -> withDraw()
            3 -> checkBalance()
            4 -> {
                println("Thanks for using CIB Bank, BYE BYE")
                System.exit(0)
            }
        }
    }

    fun checkBalance() {
        println("Your balance now is : $balance")
        doYouNeedAnythingElse()
    }

    fun withDraw() {
        println("Please enter the amount of money you need to withdraw")
        money = readLine()!!.toFloat()
        if (money <= balance) {
            balance -= money
            println("Withdraw done successfully")
            checkBalance()
        } else {
            println("Sorry, you don't have enough money ")
        }
        doYouNeedAnythingElse()
    }

    fun deposit() {
        println("Please enter the amount of money you need to deposit")
        money = readLine()!!.toFloat()
        balance += money
        println("Deposit Done Successfully")
        checkBalance()
        doYouNeedAnythingElse()

    }

    fun doYouNeedAnythingElse() {
        println("Do you need anything else ?!")
        println("1: For YES, 2: For No")
        var selectedChoice = Integer.valueOf(readLine())
        when (selectedChoice) {
            1 -> selectOperation()
            2 -> {
                println("Thanks see you again")
                exitProcess(0)
            }

        }
    }
}