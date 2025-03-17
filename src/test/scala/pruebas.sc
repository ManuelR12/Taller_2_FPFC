import Derivacion._

val f = (x: Double) => x   // f(x) = x^2
val g = (x: Double) => x * x * x  // g(x) = x^3

val df = derivada(f)  // f'(x) = 2x
val dg = derivada(g)  // g'(x) = 3x^2

val dSuma = derivadaSuma(f,g)(2)




