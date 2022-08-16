fun main() {

    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550

    val espresso = 4
    val latte = 7
    val cappuccino = 6

    while (true) {

        print("Write action (buy, fill, take, remaining, exit): > ")
        val action = readln()
        println()

        when (action) {
            "buy" -> {

                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                val wantToBuy = readln()

                when (wantToBuy) {
                    "1" -> {
                        if (water >= 250 && coffee >= 16) {
                            println("I have enough resources, making you a coffee! \n")
                            water -= 250
                            coffee -= 16
                            cups--
                            money += espresso
                        } else if (water < 250) {
                            println("Sorry, not enough water! \n")
                        } else {
                            println("Sorry, not enough coffee! \n")
                        }
                    }
                    "2" -> {
                        if (water >= 350 && coffee >= 20 && milk >= 75) {
                            println("I have enough resources, making you a coffee! \n")
                            water -= 350
                            milk -= 75
                            coffee -= 20
                            cups--
                            money += latte
                        } else if (water < 350) {
                            println("Sorry, not enough water! \n")
                        } else if (coffee < 20) {
                            println("Sorry, not enough coffee! \n")
                        } else {
                            println("Sorry, not enough milk \n")
                        }
                    }
                    "3" -> {
                        if (water >= 200 && coffee >= 12 && milk >= 100) {
                            println("I have enough resources, making you a coffee! \n")
                            water -= 200
                            milk -= 100
                            coffee -= 12
                            cups--
                            money += cappuccino
                        } else if (water < 200) {
                            println("Sorry, not enough water! \n")
                        } else if (coffee < 12) {
                            println("Sorry, not enough coffee! \n")
                        } else {
                            println("Sorry, not enough milk \n")
                        }
                    }
                    "back" -> {
                        println()
                        continue
                    }
                }
            }
            "fill" -> {

                print("Write how many ml of water do you want to add: > ")
                val mlOfWater = readln().toInt()
                water += mlOfWater

                print("Write how many ml of milk do you want to add: > ")
                val mlOfMilk = readln().toInt()
                milk += mlOfMilk

                print("Write how many grams of coffee beans do you want to add: > ")
                val gmOfCoffee = readln().toInt()
                coffee += gmOfCoffee

                print("Write how many disposable cups of coffee do you want to add: > ")
                val cupsOfCoffee = readln().toInt()
                cups += cupsOfCoffee
                println()

            }
            "take" -> {
                println("I gave you $$money")
                println()
                money = 0
            }
            "remaining" -> {
                coffeeMachine(water, milk, coffee, cups, money)
                println()
            }
            "exit" -> {
                break
            }
        }
        println()
    }
}

fun coffeeMachine(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$coffee g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")
}
