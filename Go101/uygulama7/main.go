// 1-) Underlying Type 'int' olacak şekilde kendi veri tipinizi oluşturunuz
// veri tipi ve değerini '10' yazdırınız.

/* package main

import "fmt"

type myType int

func main() {

	var x myType
	x = 10
	fmt.Printf("%T, %v", x, x)

} */

// 2-) Başlangıç değeri 10 olan bir x değişkeni oluşturun sonrasında
// bulunduğu adres üzerinden y değişkenini tanımlayıp x değerini 20 yapınız.

/* package main

import "fmt"

func main() {
	x := 10
	y := &x
	*y = 20
	fmt.Println(x)

} */

// 3-) Underlying Type struct olan Rectangle type oluşturunuz,
// display, area, circumference metodlarını yazınız.

/* package main

import "fmt"

type rectangle struct {
	x int
	y int
}

func main() {
	r1 := rectangle{10, 20}
	r1.display()
	fmt.Println("Alanı: ", r1.area())
	fmt.Println("Çevresi: ", r1.circumference())

}

func (r rectangle) display() {
	fmt.Println("Kenar uzunlukları ", r.x, " ve ", r.y, "olan dikdörtgen")
}

func (r rectangle) area() int {
	return r.x * r.y
}

func (r rectangle) circumference() int {
	return (r.x + r.y) * 2
} */

// 4-) family aile bireyleri şeklinde veri tipi oluşturalım(underlying struct).
// Sonrasında for döngüsünde yazdırınız.field age,name,isMarried field

package main

import "fmt"

type family struct {
	name      string
	age       int
	isMarried bool
}

func showFamily() []family {

	family1 := family{
		name:      "Aslı",
		age:       4,
		isMarried: false,
	}

	family2 := family{
		name:      "Cihan",
		age:       20,
		isMarried: false,
	}

	family3 := family{
		name:      "Ahmet",
		age:       40,
		isMarried: true,
	}

	family4 := family{
		name:      "Seda",
		age:       38,
		isMarried: true,
	}

	return []family{family1, family2, family3, family4}

}

func main() {

	families := showFamily()
	for i := 0; i < len(families); i++ {
		fmt.Printf("%T,%v\n", families[i], families[i])
	}
}
