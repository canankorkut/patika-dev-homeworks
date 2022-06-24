// 1-) studentName --> John Doe, grade --> 77, isPassed --> true değişkenlerini
// 3 farklı yöntem ile oluşturup, çıktısını yazdırınız.

/* package main

import "fmt"

func main() {
	var studentName string = "John Doe"
	var grade int = 77
	var isPassed bool = true

	var studentName = "John Doe"
	var grade = 77
	var isPassed = true

	studentName := "John Doe"
	grade := 77
	isPassed := true

	fmt.Println(studentName)
	fmt.Println(grade)
	fmt.Println(isPassed)

}
*/

// 2-) yukarıda belirtilen değişkinleri tek satır içerisinde tanımlayınız.
/* package main

import "fmt"

func main() { */
/* var studentName string = "John Doe"
var grade int = 77
var isPassed bool = true */

/* studentName, grade, isPassed := "John Doe", 77, true */
/* var studentName, grade, isPassed = "John Doe", 77, true

	fmt.Println(studentName)
	fmt.Println(grade)
	fmt.Println(isPassed)
} */

// 3-) "Declaration", "Asign", "Initialization", "Initial Value" kavramlarını açıklayınız.(Terminoloji)
/* package main

func main() {
	/* var studentName string // Declaration(bildirme)
	fmt.Println(studentName)  */

/* var studentName string = "John Doe"
studentname := "Canan Korkut" // Assign(atama)
fmt.Println(studentName)  */

/* var studentName string = "John Doe" // Initalization(bir değeri oluşturup başlatma) */

/* Initial value(ilk değer) John Doe studentname'in ilk değeridir.

} */

// 4-) "Statically Typed" vs "Dynamically Typed" ifadelerini Go üzerinden gösteriniz.
/* package main

import "fmt"

func main() {
	/* var grade int = 77
	grade = "Canan Korkut"  // hata verir */

/* 	var grade int = 77
	grade = 8
	// Go statically typed(static veri tipi) bir programlama dilidir.

	fmt.Println(grade)

} */

// 5-) ":=" vs "=" aradaki farkı gösteriniz.

// ! Bir değişken declare edildikten sonra ikinci kez declare edilemez ancak tekrar değer atanabilir.

package main

import "fmt"

func main() {
	/* var studentName string = "John Doe"
	var studentName string = "Canan Korkut"  // hata verir.*/

	var studentName string = "John Doe"
	studentName = "Canan Korkut"

	fmt.Println(studentName)

}
