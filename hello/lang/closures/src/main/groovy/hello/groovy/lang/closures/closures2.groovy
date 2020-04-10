package hello.groovy.lang.closures

// https://stackoverflow.com/questions/12077622/groovy-method-that-take-closure-with-one-or-two-arguments
def method(Closure c){
    def firstValue = 'a'
    def secondValue = 'b'
    if (c.maximumNumberOfParameters == 1)
        c(firstValue)
    else
        c(firstValue, secondValue)
}

//execute
method { a ->
    println "I just need $a"
}
method { a, b ->
    println "I need both $a and $b"
}