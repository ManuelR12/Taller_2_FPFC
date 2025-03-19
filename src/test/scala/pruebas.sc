import Derivacion._

val f1 = (x: Double) => 6 * x * x * x * x // f(x) = 6x^4 → f'(x) = 24x^3
val f2 = (x: Double) => 3 * x + 5 // f(x) = 3x + 5 → f'(x) = 3
val f3 = (x: Double) => 4 * x * x * x + 5 // f(x) = 4x^3 + 5 → f'(x) = 12x^2
val f4 = (x: Double) => 1.0 / x // f(x) = 1/x → f'(x) = -1/x^2
val f5 = (x: Double) => x * x - 4 * x + 7 // f(x) = x^2 - 4x + 7 → f'(x) = 2x - 4

// DERIVADA GENERICA
derivada(f1)(574) // 4538861376
derivada(f2)(862) // 3
derivada(f3)(306) // 1123632
derivada(f4)(8) // -0.015625
derivada(f5)(2) // 0

// DERIVADA RESTA
derivadaResta(f1,f2)(13) // 52725
derivadaResta(f1,f2)(84) // 14224893
derivadaResta(f3,f4)(95) // 108300.000110803
derivadaResta(f3,f4)(9) // 972.012345679
derivadaResta(f1,f5)(95) // 20576814

// DERIVADA SUMA
derivadaSuma(f2, f3)(2) // 51
derivadaSuma(f2, f3)(5) // 303
derivadaSuma(f2, f3)(-3) // 111
derivadaSuma(f2, f3)(0) // 3
derivadaSuma(f2, f3)(10) // 1203

// DERIVADA MULTIPLICACION
derivadaMult(f3, f4)(2) // 14.75
derivadaMult(f3, f4)(5) // 39.8
derivadaMult(f3, f4)(-3) //-24.5556
derivadaMult(f3, f4)(1) // 3
derivadaMult(f3, f4)(7) // 55.8980

// DERIVADA DIVISION
derivadaDiv(f2, f4)(2) // 17
derivadaDiv(f2, f4)(5) // 35
derivadaDiv(f2, f4)(-3) // -13
derivadaDiv(f2, f4)(1) // 11
derivadaDiv(f2, f4)(7) // 47


