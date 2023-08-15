let btnContainer = document.querySelector(".btn-container")

let btnTexts = ["all", "currently-reading", "to-read", "read"]

for(let i=0; i<4; i++) {
    let button = document.createElement("button")
    button.innerHTML = btnTexts[i]
    button.className = "btn-item btn btn-outline-dark"
    btnContainer.appendChild(button)
}

let menu = [
    {
        id: 1,
        title: "İki Şehrin Hikayesi",
        category: "read",
        author: "Charles Dickens",
        img: "images/ikisehrinhikayesi.jpg",
        desc: "Kitap, Londra ve Paris arasındaki farklılıkları ve Fransız Devrimi'nin etkilerini konu alır. Hikaye, özellikle Sidney Carton ve Charles Darnay gibi karakterlerin hayatlarına odaklanır. Paris ve Londra'nın toplumsal huzursuzlukları, aristokrasi ve yoksulluk arasındaki uçurum, aşk ve fedakarlık temaları etrafında işlenir. Roman, zengin tarihsel detayları ve güçlü karakter tasvirleriyle ön plana çıkar. "
    },
    {
        id: 2,
        title: "Küçük Prens",
        category: "read",
        author: "Antoine de Saint-Exupéry",
        img: "images/kucukprens.jpg",
        desc: "Bir pilotun çölde mahsur kaldığı sırada tanıştığı küçük bir prensle olan etkileşimini anlatır. Prencin dünyasından gelen öyküler ve masallar aracılığıyla, insanların maddiyat ve önemli olmayan detaylarla meşgul olduğu, çocukken sahip olunan saf duyguların nasıl unutulduğu eleştirisi yapılır. Kitap, insan ilişkileri, dostluk, sevgi ve hayatın anlamı gibi derin temaları sade bir dille işler."
    },
    {
        id: 3,
        title: "Uğultulu Tepeler",
        category: "read",
        author: "Emily Brontë",
        img: "images/ugultulutepeler.jpg",
        desc: "Sert ve acımasız bir çevrede geçen iki ailenin, Earnshaw ve Linton, karmaşık ilişkilerini anlatır. Catherine Earnshaw ve Heathcliff'in tutkulu ama karmaşık aşk hikayesi, nefret ve intikam duygularıyla örülüdür. Eserde, sevginin yıkıcı gücü, sınıf farkları, doğaüstü unsurlar ve insan doğasının karanlık yönleri işlenir."
    },
    {
        id: 4,
        title: "Yol ve Erdem",
        category: "currently-reading",
        author: "Lao Tzu",
        img: "images/yolveerdem.jpg",
        desc: "Kitap aslında Konfüçyüsçülük ve Taoizm'in önemli metinlerinden biri olan Tao Te Ching adlı eseri ifade eder. Laozi (Lao Tzu) tarafından yazıldığı düşünülen bu eser, Taoizmin temel prensiplerini ve doğa ile uyumlu yaşam felsefesini anlatır. Yol (Tao) kavramı, doğanın akışına uygun yaşamı ifade ederken, Erdem (Te) ise insanın içsel erdemini geliştirmesini ve doğaya uygun bir şekilde davranmasını vurgular. Tao Te Ching, basit ve derin öğretileriyle insanın içsel huzurunu ve uyumu bulma yolculuğunu ele alır."
    },
    {
        id: 5,
        title: "Karamazov Kardeşler",
        category: "currently-reading",
        author: "Fyodor Dostoevsky",
        img: "images/karamazovkardesler.jpg",
        desc: "Üç farklı karaktere sahip Karamazov kardeşlerin aile içi ilişkilerini, ahlaki çatışmalarını ve insan doğasının karmaşıklığını anlatır. Roman, suç, inanç, ahlak ve yaşamın anlamı gibi derin temaları ele alırken, karakterlerin hikayeleri aracılığıyla insan psikolojisi ve toplumsal çelişkileri inceler."
    },
    {
        id: 6,
        title: "Zorba",
        category: "currently-reading",
        author: "Nikos Kazantzakis",
        img: "images/zorba.jpg",
        desc: "Ana karakter olan bir yazarın, Zorba adlı sıra dışı bir adamla tanışmasıyla şekillenen hikayeyi anlatır. Zorba, özgür ruhlu, coşkulu ve yaşam dolu bir karakterdir. Roman, yazarın Zorba ile olan dostluğu aracılığıyla, hayatın tadını çıkarmayı, özgürlüğü ve duygusal zenginliği keşfetmeyi öğrenmesini konu alır. Zorba' nın yaşam felsefesi, anın keyfini çıkarmayı ve sınırları zorlamayı vurgular. Roman, insan doğasının derinliklerine inerken aynı zamanda Yunan kültürü ve toplumsal normlar hakkında da gözlem ve eleştiriler sunar."
    },
    {
        id: 7,
        title: "Kıvılcım Anı",
        category: "to-read",
        author: "Malcolm Gladwell",
        img: "images/kivilcimani.jpg",
        desc: "Toplumsal trendlerin ve fikirlerin nasıl hızla yayıldığını ve kabul gördüğünü inceler. Kitap, tipping point adını verdiği anı vurgulayarak, küçük değişimlerin nasıl büyük sonuçlar doğurabileceğini ve toplumsal değişimlerin nasıl gerçekleştiğini açıklar."
    },
    {
        id: 8,
        title: "Kendime Düşünceler",
        category: "to-read",
        author: "Marcus Aurelius",
        img: "images/kendimedusunceler.jpg",
        desc: "Roma İmparatoru Marcus Aurelius'un içsel düşüncelerini ve stoacı felsefi yaklaşımlarını içeren bir kitaptır. Aurelius, hayatın geçici doğasını ve ahlaki değerleri vurgulayarak, bireysel gelişim ve içsel huzurun önemini anlatır."
    },
    {
        id: 9,
        title: "Kuyucaklı Yusuf",
        category: "to-read",
        author: "SAbahattin Ali",
        img: "images/kuyucakliyusuf.jpg",
        desc: "Bir genç olan Yusuf'un aşk, özgürlük ve toplumsal baskılar arasında yaşadığı içsel çatışmayı konu alır. Köyden gelen Yusuf, Neyyire adlı genç bir kızla tanışarak hayat görüşü değiştirir. Aşk ve özgürlük arayışı, onu toplumun beklentileriyle çatışmaya sokar ve içsel bir yolculuğa çıkarır."
    },
]

let sectionCenter = document.querySelector(".section-center")
let btnItems = document.querySelectorAll(".btn-item")

btnItems.forEach(function(button) {
    button.addEventListener("click", function() {
        let category = button.innerHTML
        showMenuItems(category)
    })
})

function showMenuItems(category) {
    sectionCenter.innerHTML = ""
    let filteredItems = menu.filter(function(item) {
        return category === "all" || item.category === category
    })

    filteredItems.map(function(item) {
        let menuItems = document.createElement("div")
        menuItems.className = "menu-items col-lg-6 col-sm-12"

        let itemContent = `
            <img src= "${item.img}" alt= "${item.title}" class="photo" />
            <div class= "menu-info">
                <div class="menu-title">
                    <h4>${item.title}</h4>
                    <h4 class= "author">by ${item.author}</h4>
                </div>
                <div class= "menu-text">
                    ${item.desc}
                </div>
            </div>
        `
        menuItems.innerHTML = itemContent
        sectionCenter.appendChild(menuItems)
    })
}