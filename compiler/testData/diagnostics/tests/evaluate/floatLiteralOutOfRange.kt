// !DIAGNOSTICS: -UNUSED_VARIABLE, -UNUSED_EXPRESSION

fun test() {
    <!FLOAT_LITERAL_CONFORMS_INFINITY!>1.2E400F<!>
    <!FLOAT_LITERAL_CONFORMS_ZERO!>1.2E-400F<!>
    <!FLOAT_LITERAL_CONFORMS_INFINITY!>11111111111111111111111111111111111111111111111111111111111111111F<!>
    <!FLOAT_LITERAL_CONFORMS_ZERO!>0.000000000000000000000000000000000000000000000000000000000000001F<!>
    0.000000000000000000000000000000000000001000000000000000000000000F

    <!FLOAT_LITERAL_CONFORMS_INFINITY!>1.2E400f<!>
    <!FLOAT_LITERAL_CONFORMS_ZERO!>1.2E-400f<!>
    <!FLOAT_LITERAL_CONFORMS_INFINITY!>11111111111111111111111111111111111111111111111111111111111111111f<!>
    <!FLOAT_LITERAL_CONFORMS_ZERO!>0.000000000000000000000000000000000000000000000000000000000000001f<!>
    0.000000000000000000000000000000000000001000000000000000000000000f

    val d1: Double = <!FLOAT_LITERAL_CONFORMS_INFINITY!>1.2E400<!>
    val d2: Double = <!FLOAT_LITERAL_CONFORMS_ZERO!>1.2E-400<!>
    val d3: Double = 11111111111111111111111111111111111111111111111111111111111111111.0
    val d4: Double = 0.000000000000000000000000000000000000000000000000000000000000001
    val d5: Double = 0.000000000000000000000000000000000000001000000000000000000000000
}