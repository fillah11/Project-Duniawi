package id.infinitelearning.KotlinSubmission.exercise4


import id.infinitelearning.KotlinSubmission.exercise4.Validation

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw Validation("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Fillah")
        // validateAndSayHello("")
        println("Program")
    } catch (error: Validation) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}